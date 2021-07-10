package arrayssorting;

public class currencyConverter {

	double[] exchangeRates = new double[] {63.3,3.0,4.0};
	
	public void printCurrencies() {
		System.out.println("Rupee: "+exchangeRates[0]);
		System.out.println("Dhiram: "+exchangeRates[1]);
		System.out.println("Real: "+exchangeRates[exchangeRates.length-1]);
		System.out.println("Currencies: "+exchangeRates.length );
	}
	public static void main(String[] args) {
		
		currencyConverter cc = new currencyConverter();
		cc.printCurrencies();
	}

}
