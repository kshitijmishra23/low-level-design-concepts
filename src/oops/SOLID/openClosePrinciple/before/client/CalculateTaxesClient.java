package oops.SOLID.openClosePrinciple.before.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculatorFactory;


public class CalculateTaxesClient {
    public static void main(String[] args) {
       
        EmployeeRepository repository = new EmployeeRepository();

        TaxCalculatorFactory taxCalculatorFactory = new TaxCalculatorFactory();

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
   

        double totalTaxes = 0;
        for (Employee employee: employees){

            // compute individual tax
            TaxCalculator taxCalculator = taxCalculatorFactory.createTaxCalculator(employee);
            double tax = taxCalculator.calculate(employee);
            String formattedTax = currencyFormatter.format(tax);
            // add to company total taxes
            totalTaxes += taxCalculator.calculate(employee);
        }
    }
}
