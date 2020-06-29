package oops.abstraction.object;

enum Currency {
	INR, USD;
	public double conversionRateToINR(Currency currency) {
		if(currency == USD)
			return 70.0;
		return 1.0;	
	}
}