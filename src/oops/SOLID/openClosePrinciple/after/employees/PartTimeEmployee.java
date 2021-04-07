package oops.SOLID.openClosePrinciple.after.employees;

import oops.SOLID.openClosePrinciple.after.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.after.taxes.TaxCalculatorIntern;
import oops.SOLID.openClosePrinciple.after.taxes.TaxCalculatorPartTimeEmp;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }

    public double TaxCalculate(){
        TaxCalculator calculator = new TaxCalculatorPartTimeEmp();
        return calculator.calculate(this);
    }
}