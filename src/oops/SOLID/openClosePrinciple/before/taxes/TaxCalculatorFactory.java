package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.EmployeeType;

public class TaxCalculatorFactory {

    public TaxCalculator getTaxCalculator(Employee employee) {

        if(employee.getEmployeeType() == EmployeeType.FULL_TIME_EMPLOYEE)
            return new TaxCalculatorFullTimeEmployee();
        else if(employee.getEmployeeType() == EmployeeType.PART_TIME_EMPLOYEE)
            return new TaxCalculatorPartTimeEmployee();
        else if(employee.getEmployeeType() == EmployeeType.INTERN)
            return new TaxCalculatorIntern();
        else
            throw new IllegalArgumentException("Invalid Employee type");
    }

}