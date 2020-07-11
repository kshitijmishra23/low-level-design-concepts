package oops.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.EmailSender;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;

public class PaymentProcessor {

    private EmployeeFileRepository repository;

    public PaymentProcessor(EmployeeFileRepository repository) {
        this.repository = repository;
    }

    public int sendPayments(){
        List<Employee> employees = repository.findAll();
        int totalPayments = 0;

        for(Employee employee : employees){
            totalPayments += employee.getMonthlyIncome();
            EmailSender.notify(employee);
        }

        return totalPayments;
    }
}
