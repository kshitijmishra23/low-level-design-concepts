package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

public class FullTimeEmployeeTaxCalculator implements TaxCalculatorInterface {
    private final int incomeTaxPercentage;
    private final int professionalTaxPercentage;
    private final int educationCess;

    public FullTimeEmployeeTaxCalculator(int incomeTaxPercentage, int professionalTaxPercentage, int educationCess) {
        this.incomeTaxPercentage = incomeTaxPercentage;
        this.professionalTaxPercentage = professionalTaxPercentage;
        this.educationCess = educationCess;
    }

    public double calculate(Employee employee) {
        int salary = employee.getMonthlyIncome();
        return 
                (salary * professionalTaxPercentage) / 100d +
                (salary * incomeTaxPercentage) / 100d +
                (salary * educationCess) / 100d ;

    }
}