package oops.SOLID.openClosePrinciple.before.persistence;

import java.util.Arrays;
import java.util.List;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class EmployeeRepository {

    public List<Employee> findAll(){

        // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);

        Employee josh = new Intern("Josh Pitzer", 400, 40);
        Employee nathan = new Intern("Nathan Brown", 450, 40);

        return Arrays.asList(anna, billy, steve, magda, josh, nathan);
    }
}