package de.msg.training.examples.immutable;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class ImmutabilityDetector {

  private boolean isImmutable(final Object obj) {
    Class<?> objClass = obj.getClass();

    if (!Modifier.isFinal(objClass.getModifiers()))
      throw new AssertionError("Class is not final!");

    Field[] objFields = objClass.getDeclaredFields();
    for (Field objField : objFields) {
      if (!Modifier.isFinal(objField.getModifiers()))
        throw new AssertionError("Field '" + objField.getName() + "' is not final!");
      if (Modifier.isPublic(objField.getModifiers()))
        throw new AssertionError("Field '" + objField.getName() + "' is public!");

    }

    Method[] objMethods = objClass.getDeclaredMethods();
    for (Method method : objMethods)
      if (!Modifier.isStatic(method.getModifiers())
          && !isImmutabilityKept(method, obj))
        return false;

    return true;
  }


  private boolean isImmutabilityKept(final Method method, final Object object) {
    if (method.getName().startsWith("set"))
      throw new AssertionError("Class contains setters!");
    Class<?> returnType = method.getReturnType();
    if (returnType.isPrimitive() || String.class.equals(returnType) || Integer.class.equals(returnType)
        || returnType.isEnum())
      return true;
    else {
      try {
        Object returnValue = method.invoke(object, new Object[] {});
        if (returnValue instanceof Date) {
          Date original = (Date) returnValue;
          original.setTime(original.getTime() + 5);
          Date copy = (Date) method.invoke(object, new Object[] {});
          if (original.equals(copy))
            throw new AssertionError("Date getter should send a copy!");
        }
        else if (returnValue instanceof List) {
          List<?> original = (List<?>) returnValue;

          boolean immutable = false;
          try {
            original.add(null);
          }
          catch (UnsupportedOperationException e) {
            immutable = true;
          }

          if (!immutable)
            throw new AssertionError("List modifiable.");
        }
      }
      catch (IllegalArgumentException e) {
        e.printStackTrace();
        return false;
      }
      catch (IllegalAccessException e) {
        e.printStackTrace();
        return false;
      }
      catch (InvocationTargetException e) {
        e.printStackTrace();
        return false;
      }
      return true;
    }
  }


  @Test
  public void isObjectImmutable() {
    ImmutableDate date = new ImmutableDate(new Date());

    assertTrue(isImmutable(date));
  }

}
