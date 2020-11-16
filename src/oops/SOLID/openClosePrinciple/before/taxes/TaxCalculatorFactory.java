package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;


public class TaxCalculatorFactory {
    
    public static TaxCalculator getTaxInstance(Employee employee){
        if(FullTimeEmployee.class.getName().equals(employee.getClass().getName())){
            return new TaxCalculateFTE();
        }
        else if(PartTimeEmployee.class.getName().equals(employee.getClass().getName())){
            return new TaxCalculatePTE();
        }
        return new TaxCalculateIntern();
    }
}
