package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

import java.util.HashMap;

public class TaxPayableFactory {

    public static HashMap<Class,TaxPayable> taxPayableObjects = new HashMap<>();

    static {
        taxPayableObjects.put(FullTimeEmployee.class, new FullTimeEmpTaxPayable());
        taxPayableObjects.put(PartTimeEmployee.class, new PartTimeEmpTaxPayable());
        taxPayableObjects.put(Intern.class, new InternTaxPayable());
    }
    public static TaxPayable createPayableObj(Employee employee){
        return taxPayableObjects.get(employee.getClass());
    }
}
