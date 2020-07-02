package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

import java.security.InvalidParameterException;

public class TaxCalculatorFactory {
    public static Taxable getTaxCalculator(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeEmployeeTaxCalculator();
        } else if (employee instanceof PartTimeEmployee) {
            return new PartTimeEmployeeTaxCalculator();
        } else if (employee instanceof Intern) {
            return new InternTaxCalculator();
        } else {
            throw new InvalidParameterException("Employee Type not supported.");
        }
    }
}
