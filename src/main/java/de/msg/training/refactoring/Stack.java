package de.msg.training.refactoring;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack {

  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 2048;


  public Stack() {
    elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }


  public void push(final Object e) {
    ensureCapacity();
    elements[size++] = e;
  }


  public Object pop() {
    if (size == 0)
      throw new EmptyStackException();
    return elements[--size];
  }


  /**
   * Ensure space for at least one more element, roughly
   * doubling the capacity each time the array needs to grow.
   */
  private void ensureCapacity() {
    if (elements.length == size)
      elements = Arrays.copyOf(elements, 2 * size + 1);
  }

}
