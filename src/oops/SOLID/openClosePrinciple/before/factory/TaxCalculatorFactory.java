package oops.SOLID.openClosePrinciple.before.factory;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.before.exception.TaxCalculatorNotImplementedException;
import oops.SOLID.openClosePrinciple.before.taxes.FullTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.PartTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class TaxCalculatorFactory {
    public static TaxCalculator getTaxCalculator(Employee employee) throws TaxCalculatorNotImplementedException {
        if(employee instanceof FullTimeEmployee)
            return FullTimeEmployeeTaxCalculator.getInstance();
        else if(employee instanceof PartTimeEmployee)
            return PartTimeEmployeeTaxCalculator.getInstance();
        else if(employee instanceof Intern)
            return InternTaxCalculator.getInstance();

        throw new TaxCalculatorNotImplementedException("Tax Calculator has not been implemented for given employee type");
    }
}
