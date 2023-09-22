package util;

public class CurrencyConverter {
	
	public static double calculoPagamentoReais(double dollarPrice, double dollarsBought) {
		return (dollarPrice * dollarsBought) + (dollarPrice * dollarsBought * 6 / 100);
		
	}
}
