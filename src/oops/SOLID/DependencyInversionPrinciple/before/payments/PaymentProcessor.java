package oops.SOLID.DependencyInversionPrinciple.before.payments;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeRepository;

public class PaymentProcessor {

    private final EmployeeRepository employeeRepository;

    public PaymentProcessor(final EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public int sendPayments(){
    	return employeeRepository.findAll().stream()
            .map(Employee::getMonthlyIncome)
            .reduce(0, Integer::sum);
    }
}
