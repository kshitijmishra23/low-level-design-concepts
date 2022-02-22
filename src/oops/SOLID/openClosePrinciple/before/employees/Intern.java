package oops.SOLID.openClosePrinciple.before.employees;
package oops.SOLID.openClosePrinciple.before.taxes;

public class Intern extends Employee {
    public Intern(String fullName, int monthlyIncome, int nbHours) {
        super(fullName, monthlyIncome);
        setNbHoursPerWeek(nbHours);
    }

    public double getTax(){
        TaxCalculator tc =new InternTaxCalculator();
        return tc.calculate(this);
    }
}
