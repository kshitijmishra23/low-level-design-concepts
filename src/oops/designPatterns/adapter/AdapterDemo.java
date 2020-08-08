package oops.designPatterns.adapter;


import oops.designPatterns.adapter.adapter.CsvEmployeeAdapter;
import oops.designPatterns.adapter.adapter.DbEmployeeAdapter;
import oops.designPatterns.adapter.adapter.LdapEmployeeAdapter;
import oops.designPatterns.adapter.employees.Employee;
import oops.designPatterns.adapter.employees.EmployeeCSV;
import oops.designPatterns.adapter.employees.EmployeeDB;
import oops.designPatterns.adapter.employees.EmployeeLdap;
import oops.designPatterns.adapter.factory.EmployeeAdapterFactory;

import java.util.List;

public class AdapterDemo {

	public static void main(String[] args) {
		final EmployeeClient client = new EmployeeClient(getEmployeeAdapterFactory());
		List<Employee> employees = client.getEmployeeList();
		System.out.println(employees);
	}

	private static EmployeeAdapterFactory getEmployeeAdapterFactory() {
		final EmployeeAdapterFactory factory = new EmployeeAdapterFactory();

		factory.registerAdapterInitializer(EmployeeCSV.class.getTypeName(),
			object -> new CsvEmployeeAdapter((EmployeeCSV) object));

		factory.registerAdapterInitializer(EmployeeDB.class.getTypeName(),
			object -> new DbEmployeeAdapter((EmployeeDB) object));

		factory.registerAdapterInitializer(EmployeeLdap.class.getTypeName(),
			object -> new LdapEmployeeAdapter((EmployeeLdap) object));

		return factory;
	}
}
