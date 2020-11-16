package oops.SOLID.openClosePrinciple.before.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.factory.TaxCalculatorFactory;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxScheme;


public class CalculateTaxesClient {
    public static void main(String[] args) {
       
        EmployeeRepository repository = new EmployeeRepository();

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        TaxCalculator taxCalculator = new TaxCalculator();
        TaxCalculatorFactory factory = new TaxCalculatorFactory();


        double totalTaxes = 0;
        for (Employee employee: employees){

            // compute individual tax
            TaxScheme taxScheme = factory.getScheme(employee);
            double tax = taxScheme.calculateTax(employee);
            String formattedTax = currencyFormatter.format(tax);
            // add to company total taxes
            totalTaxes += taxScheme.calculateTax(employee);
        }

    }
}
