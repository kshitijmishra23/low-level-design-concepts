package oops.SOLID.DependencyInversionPrinciple.before.payments;

import oops.SOLID.DependencyInversionPrinciple.before.employees.Employee;

public class EmployeePaymentProcessor implements PaymentProcessor {
  @Override
  public int processPay(Employee employee) {
    int totalPayments = 0;
    totalPayments += employee.getMonthlyIncome();
    return totalPayments;
  }

  /*public int sendPayments(){
      EmployeeFileSerializer serializer =
              new EmployeeFileSerializer();

      EmployeeFileRepository employeeRepository =
              new EmployeeFileRepository(serializer);

      List<Employee> employees = employeeRepository.findAll();
      int totalPayments = 0;

      for(Employee employee : employees){
          totalPayments += employee.getMonthlyIncome();
          EmailSender.notify(employee);
      }

      return totalPayments;
  }*/
}
