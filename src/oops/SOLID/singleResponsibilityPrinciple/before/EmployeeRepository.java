package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;
import java.util.List;

import static java.util.Arrays.asList;

public class EmployeeRepository {

    private final Writer<Employee> employeeWriter;

    public EmployeeRepository(final Writer<Employee> employeeWriter){
        this.employeeWriter = employeeWriter;
    }

    public List<Employee> findAll(){
        // Employees are kept in memory for simplicity
        final Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        final Employee billy = new FullTimeEmployee("Billy Leech", 920);

        final Employee steve = new PartTimeEmployee("Steve Jones", 800);
        final Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        return asList(anna, billy, steve, magda);
    }

    public void save(final Employee employee) throws IOException {
        employeeWriter.write(employee);
    }
}