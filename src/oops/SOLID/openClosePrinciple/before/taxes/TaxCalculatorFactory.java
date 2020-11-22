
import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.taxes.FullTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.InternTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.PartTimeEmployeeTaxCalculator;
import oops.SOLID.openClosePrinciple.before.taxes.TaxCalculator;

public class TaxCalculatorFactory {
    public static TaxCalculator getInstance(Employee employee) {
        if (employee instanceof FullTimeEmployee) {
            return new FullTimeEmployeeTaxCalculator();
        }
        if (employee instanceof PartTimeEmployee) {
            return new PartTimeEmployeeTaxCalculator();
        }
        return new InternTaxCalculator();
    }
}
