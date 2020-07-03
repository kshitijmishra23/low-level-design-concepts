package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator implements TaxCalculator {

  private static final int ZERO_TAX_THRESHOLD = 300000;
  private static final int INCOME_TAX_PERCENTAGE = 15;

  @Override
  public double calculate(Employee employee) {
    if (employee.getYearlyIncome() < ZERO_TAX_THRESHOLD) {
      return 0;
    }
    return (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0;
  }
}
