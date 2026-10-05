package oops.SOLID.DependencyInversionPrinciple.before.payments;

import java.util.List;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.NotificationService;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeRepository;

public class PaymentProcessor {

    private final EmployeeRepository employeeRepository;
    private final NotificationService notificationService;

    public PaymentProcessor(EmployeeRepository employeeRepository,
                           NotificationService notificationService) {
        this.employeeRepository = employeeRepository;
        this.notificationService = notificationService;
    }

    public int sendPayments() {
        List<Employee> employees = employeeRepository.findAll();
        int totalPayments = 0;

        for (Employee employee : employees) {
            totalPayments += employee.getMonthlyIncome();
            notificationService.notify(employee);
        }

        return totalPayments;
    }
}
