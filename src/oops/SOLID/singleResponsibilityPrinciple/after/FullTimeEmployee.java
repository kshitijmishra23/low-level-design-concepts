package oops.SOLID.singleResponsibilityPrinciple.before;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }
}