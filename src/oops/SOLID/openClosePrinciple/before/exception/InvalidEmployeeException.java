package oops.SOLID.openClosePrinciple.before.exception;

public class InvalidEmployeeException extends Exception{
    public InvalidEmployeeException(String msg) {
        super(msg);
    }
}
