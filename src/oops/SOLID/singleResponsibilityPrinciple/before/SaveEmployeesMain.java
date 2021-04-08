package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public class SaveEmployeesMain {
    public static void main(String[] args) {
        // Grab employees
        List<Employee> empLi = List.of(new FullTimeEmployee("Anna Smith", 2000),
                                       new FullTimeEmployee("Billy Leech", 920),
                                       new PartTimeEmployee("Steve Jones", 800),
                                       new PartTimeEmployee("Magda Iovan", 920));

        EmployeeRepository repository = new EmployeeRepository();
        List<Employee> employees = repository.findAll();

        // Save all
        repository.saveAll(empLi);
    }
}