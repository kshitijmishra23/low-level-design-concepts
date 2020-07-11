package oops.SOLID.openClosePrinciple.before.persistence;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.before.taxes.FullTimeTaxableEmployee;
import oops.SOLID.openClosePrinciple.before.taxes.InternTaxaleEmployee;
import oops.SOLID.openClosePrinciple.before.taxes.PartTimeTaxableEmployee;
import oops.SOLID.openClosePrinciple.before.taxes.Taxable;

public class EmployeeFactory {

	public static Taxable getEmployeeType(Employee e) {
		
		if (e instanceof PartTimeEmployee)
			return new PartTimeTaxableEmployee();
		else if (e instanceof FullTimeEmployee)
			return new FullTimeTaxableEmployee();
		else if (e instanceof Intern)
			return new InternTaxaleEmployee();
		else
			return null;
			
	}
}
