package oops.SOLID.openClosePrinciple.before.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.TaxFactory;


public class CalculateTaxesClient {
    public static void main(String[] args) {
       
        EmployeeRepository repository = new EmployeeRepository();

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
   

        double totalTaxes = 0;
        for (Employee emp: employees){

            // compute individual tax
            //double tax = TaxCalculator.calculate(employee);
                        
            //String formattedTax = currencyFormatter.format(tax);
            
            // add to company total taxes
            //totalTaxes += TaxCalculator.calculate(employee);
        	
        	double tax = TaxFactory.getInstance(emp).calculateTax(emp);
        	
        	String formattedTax = currencyFormatter.format(tax);
        	System.out.println("Formatted tax of employee "+emp.getFullName()+" is "+formattedTax);
        	
        	totalTaxes += tax;
        }
        
        System.out.println("Total company taxes : "+totalTaxes);
    }
}
