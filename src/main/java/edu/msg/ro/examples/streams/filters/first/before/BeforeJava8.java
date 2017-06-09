package edu.msg.ro.examples.streams.filters.first.before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {
	public static void main(String[] args) {

		List<String> lines = Arrays.asList("java", "c#", "c++");
		List<String> result = getFilterOutput(lines, "mkyong");
		for (String temp : result) {
			System.out.println(temp); // output : java, c#
		}

	}

	private static List<String> getFilterOutput(List<String> lines, String filter) {
		List<String> result = new ArrayList<>();
		for (String line : lines) {
			if (!"c++".equals(line)) { // we dont like c++
				result.add(line);
			}
		}
		return result;
	}
}