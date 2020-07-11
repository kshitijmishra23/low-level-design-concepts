package oops.SOLID.openClosePrinciple.before.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;


public class CalculateTaxesClient {
    public static void main(String[] args) {
       
        EmployeeRepository repository = new EmployeeRepository();

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        NumberFormat currencyFormatter = CalculateTaxesClient.getCurrencyFormatter("en", "US");
       
        double totalTaxes = CalculateTaxesClient.totalTax(employees, currencyFormatter);
    }
    
    public static NumberFormat getCurrencyFormatter(String language, String country) {
    	Locale locale = new Locale(language, country);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        return currencyFormatter;
    }
    
    public static double totalTax(List<Employee> employees, NumberFormat currencyFormatter) {
    	double totalTaxes = 0;
    	TaxCalculator taxCalculator = new TaxCalculator();
        for (Employee employee: employees){
        	
            // compute individual tax
            double tax = taxCalculator.calculate(employee);
            String formattedTax = currencyFormatter.format(tax);
            // add to company total taxes
            totalTaxes += taxCalculator.calculate(employee);
        }
        return totalTaxes;
    }
    
}
