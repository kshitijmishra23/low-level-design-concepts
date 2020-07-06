package oops.SOLID.openClosePrinciple.before.taxes;


import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxCalculator implements TaxCalculator {

  private final int INCOME_TAX_PERCENTAGE = 15;
  private final int MIN_INCOME_FOR_TAX_ELIGIBILITY = 300000;

  @Override
  public double calculate(Employee employee) {

    return employee.getMonthlyIncome() * 12 < MIN_INCOME_FOR_TAX_ELIGIBILITY
        ? 0
        : employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE / 100;
  }
}
