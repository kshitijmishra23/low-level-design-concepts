package oops.SOLID.singleResponsibilityPrinciple.before.exception;

public class EmployeePersistException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public EmployeePersistException(Throwable e) {
		super("Exception caught while persisting employee", e);
	}
}
