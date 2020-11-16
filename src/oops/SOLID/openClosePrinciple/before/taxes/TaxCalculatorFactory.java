package oops.SOLID.openClosePrinciple.before.taxes;

import java.security.InvalidParameterException;
import java.util.HashMap;
import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class TaxCalculatorFactory {
  private static final HashMap<Class<? extends Employee>, TaxCalculator> TAX_CALCULATOR_MAP;

  static {
    TAX_CALCULATOR_MAP = new HashMap<>();
    TAX_CALCULATOR_MAP.put(FullTimeEmployee.class, new FullTimeEmployeeTaxCalculator());
    TAX_CALCULATOR_MAP.put(PartTimeEmployee.class, new PartTimeEmployeeTaxCalculator());
    TAX_CALCULATOR_MAP.put(Intern.class, new InternTaxCalculator());
  }

  public static TaxCalculator getTaxCalculator(Employee employee) {
    Class taxCalculatorKey = employee.getClass();
    if(TAX_CALCULATOR_MAP.containsKey(taxCalculatorKey)){
      return TAX_CALCULATOR_MAP.get(taxCalculatorKey);
    }

    throw new InvalidParameterException("Invalid employee Type:" + employee.getClass());
  }
}
