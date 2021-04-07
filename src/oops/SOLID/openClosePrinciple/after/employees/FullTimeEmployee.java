package oops.SOLID.openClosePrinciple.after.employees;

import oops.SOLID.openClosePrinciple.after.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.after.taxes.TaxCalculatorFullTimeEmp;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

    public double TaxCalculate(){
        TaxCalculator calculator = new TaxCalculatorFullTimeEmp();
        return calculator.calculate(this);
    }
}
