package oops.SOLID.DependencyInversionPrinciple.before.notification;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;
import oops.SOLID.DependencyInversionPrinciple.before.employees.FullTimeEmployee;
import oops.SOLID.DependencyInversionPrinciple.before.employees.Intern;
import oops.SOLID.DependencyInversionPrinciple.before.employees.PartTimeEmployee;

import java.util.HashMap;
import java.util.Map;

public class NotificationProcessorFactory {
  private static final Map<Class<? extends Employee>, NotificationProcessor> NOTIFICATION_PROCESSOR;

  static {
    // ideally it shoudl be dependednt of what type of notification has been turned on by employee
    NOTIFICATION_PROCESSOR = new HashMap<>();
    NOTIFICATION_PROCESSOR.put(FullTimeEmployee.class, new EmailSender());
    NOTIFICATION_PROCESSOR.put(PartTimeEmployee.class, new EmailSender());
    NOTIFICATION_PROCESSOR.put(Intern.class, new EmailSender());
  }

  public static NotificationProcessor getNotificationProcessor(Employee employee) {
    return NOTIFICATION_PROCESSOR.get(employee.getClass());
  }
}
