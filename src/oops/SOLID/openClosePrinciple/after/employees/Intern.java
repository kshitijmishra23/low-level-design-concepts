package oops.SOLID.openClosePrinciple.after.employees;

import oops.SOLID.openClosePrinciple.after.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.after.taxes.TaxCalculatorIntern;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

    public double TaxCalculate(){
        TaxCalculator calculator = new TaxCalculatorIntern();
        return calculator.calculate(this);
    }
}
