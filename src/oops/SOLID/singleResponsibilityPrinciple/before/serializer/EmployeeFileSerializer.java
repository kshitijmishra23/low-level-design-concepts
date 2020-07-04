package oops.SOLID.singleResponsibilityPrinciple.before.serializer;
import oops.SOLID.singleResponsibilityPrinciple.before.Employee;

public class EmployeeFileSerializer {
	
	public static String serializeEmployee(Employee employee) throws Exception {
		if (employee == null) {
			throw new Exception("Null employee can't be saved");
		}
        StringBuilder sb = new StringBuilder();
        sb.append("### EMPLOYEE RECORD ####");
        sb.append(System.lineSeparator());
        sb.append("NAME: ");
        sb.append(System.lineSeparator());
        sb.append("POSITION: ");
        sb.append(employee.getClass().getTypeName());
        sb.append(System.lineSeparator());
        sb.append("EMAIL: ");
        sb.append(employee.getEmail());
        sb.append(System.lineSeparator());
        sb.append("MONTHLY WAGE: ");
        sb.append(employee.getMonthlyIncome());
        sb.append(System.lineSeparator());
        return sb.toString();
	}

}
