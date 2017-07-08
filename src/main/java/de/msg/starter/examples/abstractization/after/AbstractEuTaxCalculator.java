package de.msg.starter.examples.abstractization.after;

/**
 * Implements the common part of the European tax calculators.
 *
 * @author msg_starter
 *
 */
public abstract class AbstractEuTaxCalculator implements EuTaxCalculatorIf {

	// This code was extracted from subclasses !!!!!
	/**
	 *
	 * @param profit
	 *            the profit value.
	 * @return the european coefficient for tax calculation.
	 */
	protected float getEuCoef(final float profit) {
		return (12 * profit) / 100;
	}

}
