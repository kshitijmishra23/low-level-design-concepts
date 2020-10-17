package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        Serializer employeeSerializer = new EmployeeSerializer();
        EmployeeDao employeeDao = new EmployeeDaoImpl(employeeSerializer);
        List<Employee> employees = repository.findAll();


        // Save all
        for (Employee e : employees){
            employeeDao.save(e);
        }
    }
}