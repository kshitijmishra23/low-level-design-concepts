package oops.SOLID.openClosePrinciple.after.factories;

import oops.SOLID.openClosePrinciple.after.employees.EmployeeType;
import oops.SOLID.openClosePrinciple.after.taxes.FullTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.after.taxes.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.after.taxes.PartTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.after.taxes.TaxCalculator;

public class TaxCalculatorFactory {

	public static TaxCalculator getInstance(EmployeeType type) {

		if (type == EmployeeType.FULL_TIME) {
			return new FullTimeEmployeeTaxCalculator();
		} else if (type == EmployeeType.PART_TIME) {
			return new PartTimeEmployeeTaxCalculator();
		} else if (type == EmployeeType.INTERN) {
			return new InternTaxCalculator();
		} else {
			throw new IllegalArgumentException("Invalid Employee Type!");
		}

	}

}
