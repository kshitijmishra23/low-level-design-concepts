package oops.SOLID.openClosePrinciple.before.employees;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

    public List<Integer> getTaxDetails() {
        // based on annual income\
        this.getMonthlyIncome() * 12 < 300000 ? 
        return List.of(0, 0, 0) : 
        : return List.of(15, 0, 0); // income tax, professional tax, education cess
    }
}
