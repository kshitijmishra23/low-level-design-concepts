package oops.SOLID.openClosePrinciple.before.employees;
package oops.SOLID.openClosePrinciple.before.taxes;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String fullName, int monthlyIncome) {
        super(fullName, monthlyIncome);
        this.setNbHoursPerWeek(40);
    }

    public double getTax(){
        TaxCalculator tc =new FullTimeEmployeeTaxCalculator();
        return tc.calculate(this);
    }
}
