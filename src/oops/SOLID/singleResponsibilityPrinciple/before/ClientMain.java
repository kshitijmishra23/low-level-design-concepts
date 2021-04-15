package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class ClientMain {
    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        // Add employees
        repository.addEmployee(new FullTimeEmployee("Anna Smith", 2000));
        repository.addEmployee(new FullTimeEmployee("Billy Leech", 920));
        repository.addEmployee(new PartTimeEmployee("Steve Jones", 800));
        repository.addEmployee(new PartTimeEmployee("Magda Iovan", 920));

        // Grab and save employees
        List<Employee> employees = repository.findAll();
        for (Employee e : employees){
            repository.save(e);
        }
    }
}
