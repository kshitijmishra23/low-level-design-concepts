package oops.SOLID.DependencyInversionPrinciple.before.payments;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.DependencyInversionPrinciple.before.employees.Intern;
import oops.SOLID.DependencyInversionPrinciple.before.employees.PartTimeEmployee;

import java.util.HashMap;
import java.util.Map;

public class PaymentProcessorFactory {
  private static final Map<Class<? extends Employee>, PaymentProcessor> PAYMENT_PROCESSOR;

  static {
    PAYMENT_PROCESSOR = new HashMap<>();
    PAYMENT_PROCESSOR.put(FullTimeEmployee.class, new EmployeePaymentProcessor());
    PAYMENT_PROCESSOR.put(PartTimeEmployee.class, new EmployeePaymentProcessor());
    PAYMENT_PROCESSOR.put(Intern.class, new EmployeePaymentProcessor());
  }

  public static PaymentProcessor getPayProcessor(Employee employee) {
    return PAYMENT_PROCESSOR.get(employee.getClass());
  }
}
