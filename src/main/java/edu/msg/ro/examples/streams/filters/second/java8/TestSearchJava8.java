package edu.msg.ro.examples.streams.filters.second.java8;

import java.util.Arrays;
import java.util.List;

import edu.msg.ro.examples.streams.filters.second.before.Person;

public class TestSearchJava8 {

	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Wick", 30), new Person("Ionescu", 20),
				new Person("Popescu", 40));

		Person result1 = persons.stream() // Convert to steam
				.filter(x -> "Wick".equals(x.getName())) // we want "jack" only
				.findAny() // If 'findAny' then return found
				.orElse(null); // If not found, return null

		System.out.println(result1);

		Person result2 = persons.stream().filter(x -> "Georgescu".equals(x.getName())).findAny().orElse(null);

		System.out.println(result2);

	}
}
