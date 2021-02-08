package oops.SOLID.singleResponsibilityPrinciple.after;

public class EmployeeDataSerializeUtil {

	private EmployeeDataSerializeUtil() {
	}

	public static StringBuilder format(Employee employee) {
		StringBuilder sb = new StringBuilder();
		sb.append("### EMPLOYEE RECORD ####");
		sb.append(System.lineSeparator());
		sb.append("NAME: ");
		sb.append(employee.getFullName());
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
		return sb;
	}

}
