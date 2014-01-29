package helper;

import java.math.BigInteger;

public abstract class Utilities {

	private static long increase = 0;
	
	public static BigInteger getID() {
		
		increase += 1;
		return BigInteger.valueOf(System.currentTimeMillis() + increase);
	}
}
