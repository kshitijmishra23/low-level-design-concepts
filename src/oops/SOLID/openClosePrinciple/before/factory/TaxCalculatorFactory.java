package oops.SOLID.openClosePrinciple.before.factory;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.taxes.FullTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.PartTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxScheme;

public class TaxCalculatorFactory {

    private final  String FULL_TIME_EMPLOYEE  = "FullTimeEmployee";
    private final  String PART_TIME_EMPLOYEE  = "PartTimeEmployee";
    private final   String INTERN = "Intern";
    public TaxScheme getScheme(Employee employee){
         switch (employee.getClass().getSimpleName()){
             case FULL_TIME_EMPLOYEE:
                 return new FullTimeEmployeeTaxCalculator();

             case INTERN:
                 return new InternTaxCalculator();

             case PART_TIME_EMPLOYEE:
                 return new PartTimeEmployeeTaxCalculator();

             default:
                 return null;
         }
    }
}
