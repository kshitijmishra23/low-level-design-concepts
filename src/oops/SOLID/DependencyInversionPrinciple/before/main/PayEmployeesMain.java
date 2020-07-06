package oops.SOLID.DependencyInversionPrinciple.before.main;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.notification.EmailSender;
import oops.SOLID.DependencyInversionPrinciple.before.notification.NotificationProcessor;
import oops.SOLID.DependencyInversionPrinciple.before.notification.NotificationProcessorFactory;
import oops.SOLID.DependencyInversionPrinciple.before.payments.PaymentProcessor;
import oops.SOLID.DependencyInversionPrinciple.before.payments.PaymentProcessorFactory;
import oops.SOLID.DependencyInversionPrinciple.before.repositories.EmployeeFileRepository;
import oops.SOLID.DependencyInversionPrinciple.before.serielizer.EmployeeFileSerializer;

import java.util.List;

public class PayEmployeesMain {

  public static void main(String[] args) {
    EmployeeFileSerializer serializer = new EmployeeFileSerializer();

    EmployeeFileRepository employeeRepository = new EmployeeFileRepository(serializer);

    List<Employee> employees = employeeRepository.findAll();
    int totalPayments = 0;
    PaymentProcessor paymentProcesser;
    NotificationProcessor notificationProcessor;
    for (Employee employee : employees) {
      paymentProcesser = PaymentProcessorFactory.getPayProcessor(employee);
      totalPayments += paymentProcesser.processPay(employee);
      notificationProcessor = NotificationProcessorFactory.getNotificationProcessor(employee);
      notificationProcessor.notify(
          employee, "You account has been credited with :" + totalPayments);
    }
  }
}
