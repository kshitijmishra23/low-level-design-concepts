package oops.SOLID.openClosePrinciple.before.employees;

public class Intern extends Employee implements IncomeTax{
   
	private final static int INCOME_TAX_PERCENTAGE = 15;
	
	public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

	@Override
	public double calculate() {
		Double tax = 0.0;
	
		if ((this.getMonthlyIncome() * 12) > 30000) {
			tax = (getIncomeTax() * getIncomeTax()) / 100.0;
		}
		return tax;
	}

	
	@Override
	public int getIncomeTax() {
		return INCOME_TAX_PERCENTAGE;
	}
}
