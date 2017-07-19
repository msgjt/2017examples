package jsf01.util;

import java.util.Random;

/**
 * @author Mihaly Fodor
 */
public enum Utility {

	INSTANCE;

	private final Random random = new Random(System.currentTimeMillis());

	public int getRandomNumber() {
		return random.nextInt();
	}

}
