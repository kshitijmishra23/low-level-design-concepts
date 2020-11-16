package oops.SOLID.openClosePrinciple.before.taxes;

import java.util.HashMap;
import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.taxes.FullTimeTaxCalculation;
import oops.SOLID.openClosePrinciple.before.taxes.PartTimeTaxCalculation;
import oops.SOLID.openClosePrinciple.before.taxes.InternTaxCalculation;


public class TaxCalculatorFactory {
	
    public static HashMap<Class,TaxCalculator> TaxCalculatorObject = new HashMap<>();
    
    static
    {
    	TaxCalculatorObject.put(FullTimeTaxCalculation.class, new FullTimeTaxCalculation());
    	TaxCalculatorObject.put(PartTimeTaxCalculation.class, new PartTimeTaxCalculation());
    	TaxCalculatorObject.put(InternTaxCalculation.class, new InternTaxCalculation());
    }
	
	public static TaxCalculator getEmployeeTaxCalculator(Employee e){
		return TaxCalculatorObject.get(e.getClass());
	}
}