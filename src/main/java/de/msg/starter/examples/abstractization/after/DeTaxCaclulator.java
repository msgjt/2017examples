package de.msg.starter.examples.abstractization.after;

/**
 * Calculates the german taxes.
 * 
 * @author msg_starter
 *
 */
public strictfp class DeTaxCaclulator extends AbstractEuTaxCalculator {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public float calculate(final float profit) {
		return this.getEuCoef(profit) + ((300 * profit) / 1000);
	}
}
