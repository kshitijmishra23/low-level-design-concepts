package oops.SOLID.openClosePrinciple.before.client;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.before.taxes.FullTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.PartTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;


public class TaxCalculatorFactory {

    public static TaxCalculator getTaxCalculator(Employee e) throws Exception{
        if (e instanceof FullTimeEmployee){
            return new FullTimeEmployeeTaxCalculator();
        }
        else if (e instanceof PartTimeEmployee){
            return new PartTimeEmployeeTaxCalculator();
        }

        else if (e instanceof Intern){
            return new InternTaxCalculator();
        }
        else {
            throw new Exception("TAX CALCULATOR NOT IMPLEMENTED FOR CLASS" + e.getClass().getTypeName());
        }
    }
}
