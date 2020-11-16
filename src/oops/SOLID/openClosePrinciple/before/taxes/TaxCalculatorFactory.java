package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.EmployeeType;

import java.util.Map;

public class TaxCalculatorFactory {

    private static Map<EmployeeType, Taxable> factoryMap = Map.of(
            EmployeeType.FULL_TIME, new FullTimeEmployeeTaxCalculator(),
            EmployeeType.PART_TIME, new PartTimeEmployeeTaxCalculator(),
            EmployeeType.INTERN, new InternEmployeeTaxCalculator()
    );

    public static Taxable getTaxCalculator(EmployeeType employeeType) {
        if (!factoryMap.containsKey(employeeType)) {
            System.out.println("No tax calculator found for employee type: " + employeeType);
        }
        return factoryMap.get(employeeType);
    }
}