package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class PartTimeEmpTaxPayable implements TaxPayable{

    private final double INCOME_TAX_PERCENT = 20;
    private final double PROFESSIONAL_TAX_PERCENT = 3;
    private final double EDUCATIONAL_CESS_PERCENT = 1;

    @Override
    public double calculateTax(Employee employee) {
        int monthlySalary = employee.getMonthlyIncome();
        return
                (INCOME_TAX_PERCENT * monthlySalary)/100
                        + (PROFESSIONAL_TAX_PERCENT * monthlySalary)/100
                        + (EDUCATIONAL_CESS_PERCENT *monthlySalary)/100;
    }
}
