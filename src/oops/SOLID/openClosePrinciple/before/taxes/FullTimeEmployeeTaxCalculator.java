package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FullTimeEmployeeTaxCalculator implements TaxCalculator {
  private static final int INCOME_TAX_PERCENTAGE = 30;
  private static final int PROFESSIONAL_TAX_PERCENTAGE = 2;
  private static final int EDUCATION_CESS_PERCENT = 1;

  @Override
  public double calculate(Employee employee) {
    double taxWithoutCess = (employee.getMonthlyIncome() * PROFESSIONAL_TAX_PERCENTAGE) / 100.0 +
        (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100.0 ;

    return taxWithoutCess * (1+ EDUCATION_CESS_PERCENT/100.0);

  }
}
