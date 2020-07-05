package oops.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.Notifier;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.Repository;

public class EmployeePaymentProcessor implements PaymentProcessor {
	
	private Repository<Employee> repository;
	private Notifier<Employee> notifier;
	
	public EmployeePaymentProcessor(Repository<Employee> repository, Notifier<Employee> notifier) {
		this.repository = repository;
		this.notifier = notifier;
	}

	@Override
    public int sendPayments(){	
        List<Employee> employees = repository.findAll();
        int totalPayments = 0;
        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            notifier.notify(employee);
        }
        return totalPayments;
    }
}
