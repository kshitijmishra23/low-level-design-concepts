package oops.SOLID.singleResponsibilityPrinciple.before;

public class SaveEmployeeDataToFileImpl implements SaveEmployeeData {

    private EmployeeRepoForFileStorage employeeRepoForFileStorage = new EmployeeRepoForFileStorage();

    @Override
    public void saveData(Employee employee) {
        employeeRepoForFileStorage.save(employee);
    }
}
