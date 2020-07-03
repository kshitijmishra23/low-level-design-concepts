package oops.SOLID.openClosePrinciple.before.client;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.TaxHelper;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;


public class CalculateTaxesClient {
    public static void main(String[] args) {

        EmployeeRepository repository = new EmployeeRepository();

        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        TaxHelper taxHelper = new TaxHelper();

        double totalTaxes = 0;
        try {
            for (Employee employee : employees) {
                // compute individual tax
                double tax = taxHelper.getTaxForEmployee(employee);
                String formattedTax = currencyFormatter.format(tax);
                System.out.println(String.format("Taxes for employee: %s are %s", employee, formattedTax));
                // add to company total taxes
                totalTaxes += taxHelper.getTaxForEmployee(employee);
            }
        } catch (Exception e) {
            System.out.println("Exception in calculating taxes.");
            e.printStackTrace();
        }
        System.out.println(String.format("Total taxes paid by all employees are: %s", totalTaxes));
    }
}
