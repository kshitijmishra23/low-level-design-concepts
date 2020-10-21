package oops.SOLID.openClosePrinciple.before.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
//import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalcInterface;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalcFactorty;

public class CalculateTaxesClient {
    public static void main(String[] args) {
       
        EmployeeRepository repository = new EmployeeRepository();
        TaxCalcInterface TaxCalculator;
        // Grab employees
        List<Employee> employees = repository.findAll();

        // Calculate taxes
        Locale locale = new Locale("en", "US");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
   

        double totalTaxes = 0;
        for (Employee employee: employees){
            TaxCalculator = TaxCalcFactorty.getTaxCalculator(employee);
            double tax = TaxCalculator.calculateTax(employee.getMonthlyIncome());
            
            // compute individual tax
            //double tax = TaxCalculator.calculate(employee);
            String formattedTax = currencyFormatter.format(tax);
            // add to company total taxes
            //totalTaxes += TaxCalculator.calculate(employee);
            totalTaxes += tax;
        }
    }
}
