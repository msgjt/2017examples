package edu.msg.ro.examples.lambdas.before;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {
	public static void main(String[] args) {
		List<Developer> listDevs = DeveloperProviderUtil.createDevelopers();

		System.out.println("Before Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}

		// sort by age
		Collections.sort(listDevs, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("After Sort");
		for (Developer developer : listDevs) {
			System.out.println(developer);
		}
	}
}
