package oops.SOLID.openClosePrinciple.before.employees;
import oops.SOLID.openClosePrinciple.before.taxes;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

    @Override
    public double getTaxableAmount(){
        FullTimeEmployeeTaxCalculator.calculate(this);
    }
}
