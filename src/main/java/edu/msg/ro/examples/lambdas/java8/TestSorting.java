package edu.msg.ro.examples.lambdas.java8;

import java.util.List;

import edu.msg.ro.examples.lambdas.before.Developer;
import edu.msg.ro.examples.lambdas.before.DeveloperProviderUtil;

public class TestSorting {

	public static void main(String[] args) {

		List<Developer> listDevs = DeveloperProviderUtil.createDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		System.out.println("After Sort");

		// lambda here!
		listDevs.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());

		// java 8 only, lambda also, to print the List
		listDevs.forEach((developer) -> System.out.println(developer));
	}
}
