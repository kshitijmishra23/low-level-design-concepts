package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        for (Employee e : employees){
            try {
				EmployeeRepository.save(e);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
        }
    }
}