package oops.SOLID.singleResponsibilityPrinciple.before;

public class ApplicationLogger {

    public void info(String message) {
        System.out.println("Info : " + message);
    }

    public void error(String message, Exception e) {
        System.out.println("Error : " + message + ", " + e.getStackTrace().toString());
    }

}
