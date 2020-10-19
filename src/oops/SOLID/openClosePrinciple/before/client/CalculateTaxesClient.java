package oops.SOLID.openClosePrinciple.before.client;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.factory.TaxCalculatorFactory;
import oops.SOLID.openClosePrinciple.before.persistence.EmployeeRepository;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;


public class CalculateTaxesClient {
    private static Locale m_locale;
    private static NumberFormat m_currencyFormat;

    private static void init() {
        setLocale();
        setCurrencyFormat();
    }

    private static void setLocale() {
        m_locale = new Locale("en", "US");
    }

    private static void setCurrencyFormat() {
        m_currencyFormat = NumberFormat.getCurrencyInstance(m_locale);
    }

    private static List<Employee> getEmployeesFromRepository() {
        EmployeeRepository repository = new EmployeeRepository();
        // Grab employees
        List<Employee> employees = repository.findAll();
        return employees;
    }

    private static double getTotalTax(List<Employee> employees) {
        // Calculate taxes
        double totalTax = 0;
        for (Employee employee: employees){
            try {
                // compute individual tax
                TaxCalculator taxCalculator = TaxCalculatorFactory.getTaxCalculator(employee);
                double tax = taxCalculator.calculate(employee);
                // add to company total taxes
                totalTax += tax;
            }
            catch (Exception exception) {
                System.out.println(exception.toString());
            }
        }
        return totalTax;
    }

    private static void printFormattedTax(double totalTax) {
        System.out.println("Total tax paid by employees of the company is: " + m_currencyFormat.format(totalTax));
    }

    public static void main(String[] args) {
        init();

        List<Employee> employees = getEmployeesFromRepository();
        double totalTax = getTotalTax(employees);
        printFormattedTax(totalTax);
    }
}
