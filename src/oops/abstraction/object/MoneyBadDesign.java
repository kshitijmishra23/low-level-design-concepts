package oops.abstraction.object;

public class MoneyBadDesign {
	private double value;
	private Currency currency;
	
	public MoneyBadDesign(double value, Currency currency) {
		this.value = value;
		this.currency = currency;
	}
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Currency getCurrency() {
		return currency;
	}
	

}

class Client{
	private static void dispenseFunds(MoneyBadDesign money) {
		//DispenseFunds
	}
	public static void test() {
		
		MoneyBadDesign balance = new MoneyBadDesign(1.0, Currency.USD);
		MoneyBadDesign request = new MoneyBadDesign(2.0, Currency.INR);
		
		/*if(balance.getValue() > request.getValue()) {
			dispenseFunds(request);
		}*/
		double normalizedBalance = balance.getValue() 
				* balance.getCurrency().conversionRateToINR(balance.getCurrency());
		
		double normalizedRequest = request.getValue()
				* request.getCurrency().conversionRateToINR(request.getCurrency());
		
		if(normalizedBalance > normalizedRequest) {
			dispenseFunds(request);
		}

	}
}
