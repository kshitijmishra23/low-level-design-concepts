package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternTaxPayable implements TaxPayable{

    private final double INCOME_TAX_PERCENT = 15;

    @Override
    public double calculateTax(Employee employee) {

        int monthlySalary = employee.getMonthlyIncome();
        int annualSalary = monthlySalary * 12;
        if(annualSalary < 300000)
            return 0;
        return (INCOME_TAX_PERCENT * monthlySalary)/100;

    }
}
