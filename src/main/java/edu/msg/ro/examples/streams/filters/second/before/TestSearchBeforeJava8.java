package edu.msg.ro.examples.streams.filters.second.before;

import java.util.Arrays;
import java.util.List;

public class TestSearchBeforeJava8 {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Wick", 30), new Person("Ionescu", 20),
				new Person("Popescu", 40));
		Person result = getStudentByName(persons, "Wick");
		System.out.println(result);
	}

	private static Person getStudentByName(List<Person> persons, String name) {
		Person result = null;
		for (Person temp : persons) {
			if (name.equals(temp.getName())) {
				result = temp;
			}
		}
		return result;
	}
}