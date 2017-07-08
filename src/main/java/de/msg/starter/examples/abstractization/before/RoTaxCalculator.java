package de.msg.starter.examples.abstractization.before;

public class RoTaxCalculator {
	public float calculate(final float profit) {
		final float euCoef = (12 * profit) / 100; // This code is duplicate
		return euCoef + 450;
	}
}
