package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.before.taxes.impl.FullTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.impl.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.impl.PartTimeEmployeeTaxCalculator;


public class TaxCalculatorFactory {

    private static final FullTimeEmployeeTaxCalculator fullTimeEmployeeTaxCalculator = new FullTimeEmployeeTaxCalculator();
    private static final PartTimeEmployeeTaxCalculator partTimeEmployeeTaxCalculator = new PartTimeEmployeeTaxCalculator();
    private static final InternTaxCalculator internTaxCalculator = new InternTaxCalculator();

    public static TaxCalculator getTaxCalculator(Employee e) {
        if (e instanceof FullTimeEmployee)
            return fullTimeEmployeeTaxCalculator;

        if (e instanceof PartTimeEmployee)
            return partTimeEmployeeTaxCalculator;

        if (e instanceof Intern)
            return internTaxCalculator;

        return null;
    }

}
