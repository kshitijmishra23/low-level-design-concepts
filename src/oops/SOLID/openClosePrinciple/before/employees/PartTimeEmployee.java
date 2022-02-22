package oops.SOLID.openClosePrinciple.before.employees;
package oops.SOLID.openClosePrinciple.before.taxes;

public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(20);
    }

    public double getTax(){
        TaxCalculator tc =new PartTimeEmployeeTaxCalculator();
        return tc.calculate(this);
    }
}