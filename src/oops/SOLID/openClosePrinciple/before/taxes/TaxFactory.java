package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.InternEmployee;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class TaxFactory {

    public ITaxCalculator createInstance(Employee employee)
    {
        if(employee instanceof FullTimeEmployee)
            return new TaxCalculatorFullTime();
        else if(employee instanceof PartTimeEmployee)
            return new TaxCalculatorPartTime();
        else if(employee instanceof InternEmployee)
            return new TaxCalculatorIntern();
        return null;
    }
}
