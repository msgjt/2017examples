package edu.msg.ro.examples.streams.filters.first.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("java", "c#", "c++");
		List<String> result = lines.stream() // convert list to stream
				.filter(line -> !"c++".equals(line)) // we dont like C++
				.collect(Collectors.toList()); // collect the output and convert
											   // streams to a List

		result.forEach(System.out::println); // output : spring, node
	}
}
