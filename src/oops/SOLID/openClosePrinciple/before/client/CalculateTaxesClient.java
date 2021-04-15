package oops.SOLID.openClosePrinciple.before.client;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.FullTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.InternEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.PartTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculatorInterface;

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

        TaxCalculatorInterface fullTimeEmployee = new FullTimeEmployeeTaxCalculator(30, 2, 1);
        TaxCalculatorInterface partTimeEmployee = new PartTimeEmployeeTaxCalculator(20, 3, 1);
        TaxCalculatorInterface internEmployee = new InternEmployeeTaxCalculator(15);

        double totalTaxes = 0;
        for (Employee employee: employees) {
            // compute individual tax
            if (employee.getNbHoursPerWeek() == 40) {
                double tax = fullTimeEmployee.calculate(employee);
                String formattedTax = currencyFormatter.format(tax);
                // add to company total taxes
                totalTaxes += tax;
            } else if (employee.getNbHoursPerWeek() == 20) {
                double tax = partTimeEmployee.calculate(employee);
                String formattedTax = currencyFormatter.format(tax);
                // add to company total taxes
                totalTaxes += tax;
            } else {
                double tax = internEmployee.calculate(employee);
                String formattedTax = currencyFormatter.format(tax);
                // add to company total taxes
                totalTaxes += tax;
            }
        }
    }
}
