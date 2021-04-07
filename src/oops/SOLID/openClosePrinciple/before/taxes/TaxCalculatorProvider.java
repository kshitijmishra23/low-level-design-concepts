package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.*;

public class TaxCalculatorProvider {
    private static final TaxCalculator FullTimeEmployeeTaxCalculator = new FullTimeEmployeeTaxCalculator();
    private static final TaxCalculator PartTimeEmployeeTaxCalculator = new PartTimeEmployeeTaxCalculator();
    private static final TaxCalculator InternTaxCalculator = new InternTaxCalculator();
    public static final TaxCalculator getTaxCalculator(Employee employee){
        if(employee instanceof FullTimeEmployee) return FullTimeEmployeeTaxCalculator;
        if(employee instanceof PartTimeEmployee) return PartTimeEmployeeTaxCalculator;
        if(employee instanceof Intern) return InternTaxCalculator;
        return null;
    }
}
