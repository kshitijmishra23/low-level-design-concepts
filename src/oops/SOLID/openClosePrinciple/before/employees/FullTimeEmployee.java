package oops.SOLID.openClosePrinciple.before.employees;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

    public List<Integer> getTaxDetails() {
        return List.of(30,2,1); // income tax, professional tax, education cess
    }
}
