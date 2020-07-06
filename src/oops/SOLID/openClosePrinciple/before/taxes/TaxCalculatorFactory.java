package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.*;

import java.util.HashMap;
import java.util.Map;

public class TaxCalculatorFactory {
  private static final Map<Class<? extends Employee>, TaxCalculator> TAX_CALCULATOR;

  static {
    TAX_CALCULATOR = new HashMap<>();
    TAX_CALCULATOR.put(FullTimeEmployee.class, new FTTaxCalculator());
    TAX_CALCULATOR.put(PartTimeEmployee.class, new PTTaxCalculator());
    TAX_CALCULATOR.put(Intern.class, new InternTaxCalculator());
  }

  public static TaxCalculator getTaxCalculator(Employee employee) {
    return TAX_CALCULATOR.get(employee.getClass());
  }
}
