package oops.SOLID.openClosePrinciple.before.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.FullTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.PartTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculatorFactory;


public class CalculateTaxesClient {
    public static void main(String[] args) {
        final TaxCalculatorFactory taxCalculatorFactory = getTaxCalculatorFactory();
        final EmployeeRepository repository = new EmployeeRepository();

        // Calculate taxes
        double totalTaxes = repository.findAll().stream()
            .map(employee -> taxCalculatorFactory.getTaxCalculator(employee.getClass().getTypeName())
                .calculate(employee))
            .reduce(0.0, Double::sum);
    }

    private static TaxCalculatorFactory getTaxCalculatorFactory() {
        final TaxCalculatorFactory factory = new TaxCalculatorFactory();
        factory.register(FullTimeEmployee.class.getTypeName(), new FullTimeEmployeeTaxCalculator());
        factory.register(PartTimeEmployee.class.getTypeName(), new PartTimeEmployeeTaxCalculator());
        factory.register(Intern.class.getTypeName(), new InternTaxCalculator());
        return factory;
    }
}
