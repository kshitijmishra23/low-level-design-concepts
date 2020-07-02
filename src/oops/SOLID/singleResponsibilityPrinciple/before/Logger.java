package oops.SOLID.singleResponsibilityPrinciple.before;

public class Logger {

  private Class loggingClass;

  public Logger(Class loggingClass) {
    this.loggingClass = loggingClass;
  }

  public void log(String message) {
    publishLog(loggingClass + ": " + message);
  }

  public void error(String message, Exception e) {
    publishLog(loggingClass + ": " + message + " " + e);
  }

  private void publishLog(String message) {
    //Print to console for simplicity
    System.out.println(message);
  }
}
