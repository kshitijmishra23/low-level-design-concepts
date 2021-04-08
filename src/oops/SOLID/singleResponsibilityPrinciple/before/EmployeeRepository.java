package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeRepository implements Repository<Employee>{
	
     List<Employee> employees = new ArrayList<Employee>();
     private Save<Employee> save;
     
     
	public EmployeeRepository(Save<Employee> save ){
		this.save = save;
		
		  // Employees are kept in memory for simplicity
        Employee anna = new FullTimeEmployee("Anna Smith", 2000);
        Employee billy = new FullTimeEmployee("Billy Leech", 920);

        Employee steve = new PartTimeEmployee("Steve Jones", 800);
        Employee magda = new PartTimeEmployee("Magda Iovan", 920);
        addEmployee(anna, billy, steve, magda);
	}
	
	public  void addEmployee(Employee... employees) {
			this.employees.addAll(Arrays.asList(employees));
	}

	@Override
    public List<Employee> findAll(){
        return employees;
    }
    
	@Override
	public void save(Employee... employees) {
		save.saveRecord(employees);
	}

	
}