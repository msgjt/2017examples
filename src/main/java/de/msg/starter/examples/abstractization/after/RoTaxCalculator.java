package de.msg.starter.examples.abstractization.after;

/**
 * Calculates the romanian taxes.
 *
 * @author msg_starter
 *
 */
public class RoTaxCalculator extends AbstractEuTaxCalculator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float calculate(final float profit) {
		return this.getEuCoef(profit) + 450;
	}
}
