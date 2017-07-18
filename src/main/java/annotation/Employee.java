package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Retained at runtime (so we can use them with Reflection).
// Applied to a method.
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Employee {

	String name();

	String job();

	int age() default 18;
}
