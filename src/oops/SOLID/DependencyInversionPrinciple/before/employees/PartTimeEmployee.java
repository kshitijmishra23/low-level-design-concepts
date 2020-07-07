package oops.SOLID.DependencyInversionPrinciple.before.employees;


public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }

    @Override
    public void requestTimeOff(int nbDays, Employee manager) {
                /*
        HR business logic for time off for part time employees
         */

        System.out.println("Time off request for part time employee " +
                this.getFullName() +
                "; Nb days " + nbDays +
                "; Requested from " + manager.getFullName());
    }
}
