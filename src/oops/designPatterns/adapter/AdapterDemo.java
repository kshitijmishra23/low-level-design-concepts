package oops.designPatterns.adapter;


import java.util.List;

import oops.designPatterns.adapter.employees.Employee;

public class AdapterDemo {

	public static void main(String[] args) {
		EmployeeClient client = new EmployeeClient();
		
		List<Employee> employees = client.getEmployeeList();

		for(Employee e: employees) {
			System.out.print("ID: "+ e.getId()+ ", ");
			System.out.print("First Name: "+ e.getFirstName()+ ", ");
			System.out.print("Last Name: "+ e.getLastName()+ ", ");
			System.out.println("Email: "+ e.getEmail());
		}
	}
}
