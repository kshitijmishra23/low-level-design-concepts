package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class TaxHelper {

    public double getTaxForEmployee(Employee e) throws Exception {
        TaxCalculator taxCalculator = null;
        if (e instanceof FullTimeEmployee) {
            taxCalculator = new FullTimeEmployeeTaxCalculator();
        } else if (e instanceof PartTimeEmployee) {
            taxCalculator = new PartTimeEmployeeTaxCalculator();
        } else if (e instanceof Intern) {
            taxCalculator = new InternTaxCalculator();
        } else {
            throw new Exception(e + ": No such employee found.");
        }
        return taxCalculator.calculate(e);
    }
}
