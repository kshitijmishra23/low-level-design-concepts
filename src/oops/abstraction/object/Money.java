package oops.abstraction.object;


public class Money {
	private double value;
	private Currency currency;
	
	public Money(double value, Currency currency) {
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
	private double inINR() {
		return currency == Currency.INR 
				? value
				: value * currency.conversionRateToINR(currency);
			
	}
	public boolean isGreaterThan(Money target) {
		return(inINR() > target.inINR());
	}

}

class Client2{
	private static void dispenseFunds(Money money) {
		//DispenseFunds
	}
	
	public static void test() {
		
		Money balance = new Money(1.0, Currency.USD);
		Money request = new Money(2.0, Currency.INR);

		if(balance.isGreaterThan(request)) {
			dispenseFunds(request);
		}

	}
}

