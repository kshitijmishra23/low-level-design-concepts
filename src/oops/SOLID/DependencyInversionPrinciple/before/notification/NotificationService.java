package oops.SOLID.DependencyInversionPrinciple.before.notification;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

public interface NotificationService {
    void notify(Employee employee);
}
