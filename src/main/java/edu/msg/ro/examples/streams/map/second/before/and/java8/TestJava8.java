package edu.msg.ro.examples.streams.map.second.before.and.java8;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class TestJava8 {
	public static void main(String[] args) {
		List<Staff> staff = Arrays.asList(new Staff("Wick", 30, new BigDecimal(10000)),
				new Staff("Popescu", 27, new BigDecimal(20000)), 
				new Staff("Ionescu", 33, new BigDecimal(30000)));

		// Before Java 8
		List<String> result = new ArrayList<>();
		for (Staff x : staff) {
			result.add(x.getName());
		}
		System.out.println(result); // [Wick, Popescu, Ionescu]

		// Java 8
		List<String> collect = staff.stream().map(x -> x.getName()).collect(Collectors.toList());
		System.out.println(collect); // [Wick, Popescu, Ionescu]
	}
}
