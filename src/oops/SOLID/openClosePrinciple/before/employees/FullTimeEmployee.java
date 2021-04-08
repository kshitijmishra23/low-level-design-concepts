package oops.SOLID.openClosePrinciple.before.employees;

public class FullTimeEmployee extends Employee implements IncomeTax , ProfessionalTax,EducationalTax {
   
	private final static int INCOME_TAX_PERCENTAGE = 30;
	private final static int EDUCATIONAL_TAX_PERCENTAGE = 1;
	private final static int PROFESSIONAL_TAX_PERCENTAGE = 2;
	
	public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

	@Override
	public double calculate() {
		return (this.getMonthlyIncome() * getIncomeTax()) / 100 + (this.getMonthlyIncome() * getProfessionalTax()) / 100
				+ (this.getMonthlyIncome() * getEducationalTax()) / 100;
	}

	@Override
	public int getEducationalTax() {
		return EDUCATIONAL_TAX_PERCENTAGE;
	}

	@Override
	public int getProfessionalTax() {
		return PROFESSIONAL_TAX_PERCENTAGE;
	}

	@Override
	public int getIncomeTax() {
		return INCOME_TAX_PERCENTAGE;
	}
}
