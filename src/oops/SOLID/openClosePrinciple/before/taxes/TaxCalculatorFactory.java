package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.*;

public class TaxCalculatorFactory {
	
	public static TaxCalculator create(Employee e) {		
		if(e instanceof FullTimeEmployee) {
			return new FullTimeEmployeeTaxCalculator();
		} else if(e instanceof PartTimeEmployee) {
			return new PartTimeEmployeeTaxCalculator();
		} else if(e instanceof Intern) {
			return new InternTaxCalculator();
		}
		return null;
	}

}
