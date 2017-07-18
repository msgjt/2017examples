package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationsExample {

	@Employee(age = 23, job = "Developer", name = "John")
	public void printEmployeeInfo1() {
		// TODO
	}

	@Employee(job = "Writer", name = "Luke", age = 44)
	public void printEmployeeInfo2() {
		// TODO
	}

	public void printEmployeeInfo3() {
		// TODO
	}

	public static void main(String[] args) {
		AnnotationsExample ex = new AnnotationsExample();
		System.out.println("Checking class methods for annotations...\n");
		Class exampleClass = ex.getClass();

		// Get all the methods of this class.
		for (Method method : exampleClass.getDeclaredMethods()) {

			// Check if a method has the @Employee annotation
			if (method.getAnnotation(Employee.class) != null) {

				System.out.println(method.getName() + " has the @Employee annotation.");
				for (Annotation an : method.getAnnotations()) {
					System.out.println("\t" + an.toString());
				}
			} else {
				System.out.println(method.getName() + " does not have the @Employee annotation.");
			}
		}
	}
}
