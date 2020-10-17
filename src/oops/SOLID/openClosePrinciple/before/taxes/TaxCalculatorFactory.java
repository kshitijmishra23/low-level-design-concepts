package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class TaxCalculatorFactory {
    public static ITaxCalculator getInstance(Employee employee){
        if (PartTimeEmployee.class.equals(employee.getClass())) {
            return new PartTimeEmployeeTaxCalculator();
        } else if (Intern.class.equals(employee.getClass())) {
            return new InternTaxCalculator();
        }
        return new FullTimeEmployeeTaxCalculator();
    }
}
