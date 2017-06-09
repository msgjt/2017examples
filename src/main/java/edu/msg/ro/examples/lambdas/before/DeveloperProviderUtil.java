package edu.msg.ro.examples.lambdas.before;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DeveloperProviderUtil {
	public static List<Developer> createDevelopers() {
		final List<Developer> result = new ArrayList<Developer>();
		result.add(new Developer("Bill Gates", new BigDecimal("70000"), 33));
		result.add(new Developer("Ada Byron", new BigDecimal("80000"), 20));

		return result;
	}
}
