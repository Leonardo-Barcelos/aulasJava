package util;

public class CurrencyConverter {

	private static final double IOF = 0.06;

	public static double convertDollarToReal(double amount, double dollarPrice) {

		return amount * dollarPrice * (1.0 + IOF);
	}
	private  CurrencyConverter() {}

}
