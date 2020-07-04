package oops.SOLID.singleResponsibilityPrinciple.before;

import oops.SOLID.singleResponsibilityPrinciple.before.model.Employee;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }
}