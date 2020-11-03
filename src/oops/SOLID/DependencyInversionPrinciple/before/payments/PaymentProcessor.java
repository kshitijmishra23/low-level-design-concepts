package oops.SOLID.DependencyInversionPrinciple.before.payments;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

public interface PaymentProcessor {

  int processPay(Employee employee);
}
