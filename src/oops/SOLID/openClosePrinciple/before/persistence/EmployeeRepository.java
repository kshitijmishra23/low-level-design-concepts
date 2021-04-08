package oops.SOLID.openClosePrinciple.before.persistence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import oops.SOLID.openClosePrinciple.before.employees.Employee;
import oops.SOLID.openClosePrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.openClosePrinciple.before.employees.Intern;
import oops.SOLID.openClosePrinciple.before.employees.PartTimeEmployee;

public class EmployeeRepository {

    List<Employee> employees = new ArrayList<Employee>();
    private final static int NB_HOURS_PER_WEEK= 10;
    
	public EmployeeRepository(){
		
		  // Employees are kept in memory for simplicity
       Employee anna = new FullTimeEmployee("Anna Smith", 2000);
       Employee billy = new FullTimeEmployee("Billy Leech", 920);

       Employee steve = new PartTimeEmployee("Steve Jones", 800);
       Employee magda = new PartTimeEmployee("Magda Iovan", 920);
       
       Employee intern1 = new Intern("ravi kumar", 800,NB_HOURS_PER_WEEK);
       Employee intern2 = new Intern("syam kumar", 920,NB_HOURS_PER_WEEK);
       
       addEmployee(anna, billy, steve, magda,intern1,intern2);
	}
	
	public  void addEmployee(Employee... employees) {
			this.employees.addAll(Arrays.asList(employees));
	}

	
    public List<Employee> findAll(){
        return employees;
    }
}