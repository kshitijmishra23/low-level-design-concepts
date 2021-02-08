package oops.SOLID.openClosePrinciple.after.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.after.employees.Employee;
import oops.SOLID.openClosePrinciple.after.factories.TaxCalculatorFactory;
import oops.SOLID.openClosePrinciple.after.persistence.EmployeeRepository;

public class CalculateTaxesClient {
	public static void main(String[] args) {

		EmployeeRepository repository = new EmployeeRepository();

		// Grab employees
		List<Employee> employees = repository.findAll();

		// Calculate taxes
		Locale locale = new Locale("en", "US");
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);

		double totalTaxes = 0;
		for (Employee employee : employees) {

			// compute individual tax
			double tax = TaxCalculatorFactory.getInstance(employee.getEmployeeType()).calculate(employee);

			String formattedTax = currencyFormatter.format(tax);
			System.out.println(formattedTax);

			// add to company total taxes
			totalTaxes += tax;
		}

		System.out.println(currencyFormatter.format(totalTaxes));
	}
}
