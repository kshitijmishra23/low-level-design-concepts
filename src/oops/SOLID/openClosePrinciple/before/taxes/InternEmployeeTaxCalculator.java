package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class InternEmployeeTaxCalculator implements TaxCalculatorInterface {

    private final int incomeTaxPercentage;
    private final int professionalTaxPercentage;
    private final int educationCess;

    public InternEmployeeTaxCalculator(int incomeTaxPercentage) {
        this(incomeTaxPercentage, 0,0);
    }

    public InternEmployeeTaxCalculator(int incomeTaxPercentage, int professionalTaxPercentage, int educationCess) {
        this.incomeTaxPercentage = incomeTaxPercentage;
        this.professionalTaxPercentage = professionalTaxPercentage;
        this.educationCess = educationCess;
    }

    public double calculate(Employee employee) {
        int salary = employee.getMonthlyIncome();
        if (salary > 3_00_000) {
            return
                    (salary * incomeTaxPercentage) / 100d +
                            (salary * professionalTaxPercentage) / 100d +
                            (salary * educationCess) / 100d;
        }
        return 0d;
    }
}