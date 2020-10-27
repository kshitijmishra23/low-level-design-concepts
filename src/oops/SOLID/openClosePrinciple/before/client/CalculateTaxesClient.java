package oops.SOLID.openClosePrinciple.before.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.ITaxCalculator;
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
        for (Employee employee: employees){

            // compute individual tax
            TaxFactory taxFactory = new TaxFactory();
            ITaxCalculator taxCalculator = taxFactory.createInstance(employee);
            double tax = taxCalculator.calculate(employee);;
            String formattedTax = currencyFormatter.format(tax);
            System.out.println("Tax Amount for " + employee.getFullName() + " is " + formattedTax);
            // add to company total taxes
            totalTaxes += taxCalculator.calculate(employee);
            System.out.println("Total Tax Amount for " + employee.getFullName() + " is " + totalTaxes);

        }
    }
}
