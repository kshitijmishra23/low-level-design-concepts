package oops.SOLID.singleResponsibilityPrinciple.before;

import oops.SOLID.singleResponsibilityPrinciple.before.model.Employee;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }
}