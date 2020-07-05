package oops.SOLID.DependencyInversionPrinciple.before.employees;


public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

    @Override
    public void requestTimeOff(int nbDays, Employee manager) {
                /*
        HR business logic for time off for interns
         */

        System.out.println("Time off request for intern " +
                this.getFullName() +
                "; Nb days " + nbDays +
                "; Requested from " + manager.getFullName());
    }
}
