package oops.SOLID.singleResponsibilityPrinciple.before;

public class CustomStringSerializer implements Serializer<Employee, String> {

    @Override
    public String serialize(final Employee employee){
        return "### EMPLOYEE RECORD ####" +
            System.lineSeparator() +
            "NAME: " +
            employee.getFullName() +
            System.lineSeparator() +
            "POSITION: " +
            employee.getClass().getTypeName() +
            System.lineSeparator() +
            "EMAIL: " +
            employee.getEmail() +
            System.lineSeparator() +
            "MONTHLY WAGE: " +
            employee.getMonthlyIncome() +
            System.lineSeparator();
    }
}
