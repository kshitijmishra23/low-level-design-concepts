package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class TaxCalculatorFactory {
    public TaxCalculator createTaxCalculator(Employee employee)
    {
        if(employee.getClass() == FullTimeEmployee.class)
            return new TaxCalculatorFullTime();
        else if(employee.getClass() == PartTimeEmployee.class)
            return new TaxCalculatorPartTime();
        else if(employee.getClass() == Intern.class)
            return new TaxCalculatorIntern();
        return null;
    }
}
