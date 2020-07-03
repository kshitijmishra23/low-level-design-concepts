package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FullTimeEmpTaxPayable implements TaxPayable{

    private final int INCOME_TAX_PERCENT = 30;
    private final int PROFESSIONAL_TAX_PERCENT = 2;
    private final int EDUCATIONAL_CESS_PERCENT = 1;

    @Override
    public int calculateTax(Employee employee) {
        int monthlySalary = employee.getMonthlyIncome();
        return
                (INCOME_TAX_PERCENT * monthlySalary)/100
                + (PROFESSIONAL_TAX_PERCENT * monthlySalary)/100
                + (EDUCATIONAL_CESS_PERCENT *monthlySalary)/100;
    }
}
