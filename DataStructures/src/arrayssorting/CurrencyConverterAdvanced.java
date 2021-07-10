package arrayssorting;

public class CurrencyConverterAdvanced {
	double[] exchangeRates = new double[3];

	void serviceRate(double[] rates){
		exchangeRates = rates;

	}

	void updateRate(int arrayIndex , double updatedRate){
		exchangeRates[arrayIndex] = updatedRate;
	}

	double getExchnageRate(int arrayIndex){
		return exchangeRates[arrayIndex];
	}

	double computeExchangeRate(int arrayIndex, double amount, double conversionCharges)
	{
		//double convertedCurrency;
		double Charges = amount * conversionCharges ; 
		return (amount * exchangeRates[arrayIndex]) - Charges ;
	}
	public void printCurrencies() {
		System.out.println("\nRupee: "+exchangeRates[0]);
		System.out.println("Dhiram: "+exchangeRates[1]);
		System.out.println("Real: "+exchangeRates[exchangeRates.length-1]);
		System.out.println("Currencies: "+exchangeRates.length );
	}
	public static void main(String[] args) {

		CurrencyConverterAdvanced cc = new CurrencyConverterAdvanced();
		//cc.exchangeRates=new double[]{65.3,3.0,4.0};
		cc.serviceRate(new double[]{65.3,3.0,7.0});
		cc.printCurrencies();

		double[] rates = {68.3,3.0,70.0};
		cc.serviceRate(rates);
		cc.printCurrencies();

		rates = new double[]{79.3,3.0,70.0};
		cc.serviceRate(rates);
		cc.printCurrencies();

		rates = new double[]{80.3,3.0,70.0};
		cc.updateRate(1, 7.0);
		//cc.serviceRate(rates);
		cc.printCurrencies();

		System.out.println("Converted currency: "+ cc.computeExchangeRate(0,100,0.02));



	}

}


