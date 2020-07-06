package oops.SOLID.singleResponsibilityPrinciple.piyush;

import oops.SOLID.singleResponsibilityPrinciple.piyush.dao.EmployeeRepository;
import oops.SOLID.singleResponsibilityPrinciple.piyush.model.Employee;

import java.io.IOException;
import java.util.List;

public class SaveEmployeesMain {

  public static void main(String[] args) {
    // Grab employees
    EmployeeRepository repository = new EmployeeRepository();
    List<Employee> employees = repository.findAll();

    // Save all
    for (Employee e : employees) {
      try {
        repository.save(e);
        System.out.println("Employee saved" + e.toString());
      } catch (IOException exception) {
        exception.printStackTrace();
        System.err.println("Error while saving employee" + e.toString());
      }
    }
  }
}
