package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
    	
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        PersistData persist;
        for (Employee e : employees){
            persist = new PersistEmployeeData(e);
            persist.save();
        }
    }
}