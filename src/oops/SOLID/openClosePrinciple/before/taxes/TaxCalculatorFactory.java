package oops.SOLID.openClosePrinciple.before.taxes;

import java.util.HashMap;
import java.util.Map;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class TaxCalculatorFactory {
	private static final Map<Class<? extends Employee>, TaxCalculator> TAX_CALCULATOR_MAP;
	
	static {
		TAX_CALCULATOR_MAP = new HashMap<>();
		TAX_CALCULATOR_MAP.put(FullTimeEmployee.class, new FteTaxCalculator());
		TAX_CALCULATOR_MAP.put(PartTimeEmployee.class, new PteTaxCalculator());
		TAX_CALCULATOR_MAP.put(Intern.class, new InternTaxCalculator());
	}
	
	public static TaxCalculator getTaxCalculator(Employee e) {
		return TAX_CALCULATOR_MAP.get(e.getClass());
	}

}
