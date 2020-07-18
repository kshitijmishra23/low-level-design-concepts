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
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);


        double totalTaxes = 0;
        for (Employee employee: employees){

            // compute individual tax
            try {
                TaxCalculator taxCalculator = TaxCalculatorFactory.getTaxCalculator(employee);
                double tax = taxCalculator.calculate(employee);
                String formattedTax = currencyFormatter.format(tax);
                // add to company total taxes
                totalTaxes += taxCalculator.calculate(employee);
                System.out.println(tax);
            }
            catch (Exception e){
                System.out.println("UNABLE TO FETCH TAXES FOR EMPLOYEE " + employee);
            }


        }
    }
}
