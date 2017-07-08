package de.msg.starter.examples.abstractization.after;

/**
 * Defines the methods of the eu tax calculator.
 * 
 * @author msg_starter
 *
 */
public strictfp interface EuTaxCalculatorIf {
	/**
	 * Calculates the taxes based on the given profit.
	 *
	 * @param profit
	 *            the value of profit.
	 * @return the calculated tax.
	 */
	float calculate(float profit);
}
