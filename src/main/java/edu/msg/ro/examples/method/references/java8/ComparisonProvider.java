package edu.msg.ro.examples.method.references.java8;

import java.util.Arrays;

import edu.msg.ro.examples.lambdas.before.Developer;
import edu.msg.ro.examples.lambdas.before.DeveloperProviderUtil;

public class ComparisonProvider {
	public int compareByName(Developer a, Developer b) {
		return a.getName().compareTo(b.getName());
	}

	public static void main(String[] args) {
		ComparisonProvider myComparisonProvider = new ComparisonProvider();
		Arrays.sort((Developer[]) DeveloperProviderUtil.createDevelopers().toArray(),
				myComparisonProvider::compareByName);
	}
}
