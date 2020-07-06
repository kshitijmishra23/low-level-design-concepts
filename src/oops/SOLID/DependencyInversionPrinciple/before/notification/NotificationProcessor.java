package oops.SOLID.DependencyInversionPrinciple.before.notification;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

public interface NotificationProcessor {
  void notify(Employee employee,String mesg);
}
