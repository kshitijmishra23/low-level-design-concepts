package oops.SOLID.openClosePrinciple.before.employees;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }

    public List<Integer> getTaxDetails() {
        return List.of(20, 3, 1); // income tax, professional tax, education cess
    }
}