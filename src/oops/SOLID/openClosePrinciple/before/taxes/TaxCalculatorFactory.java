package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class TaxCalculatorFactory {
	
	public static TaxPayable getEmployeeTaxClass(Employee e) {
		if (e instanceof FullTimeEmployee) {
			return new FTETaxCalculator();
			
		} else if (e instanceof PartTimeEmployee) {
			return new PTETaxCalculator();			
		} else if ( e instanceof Intern) {
			return new InternTaxCalculator();
		}
		return null;
		
	}

}
