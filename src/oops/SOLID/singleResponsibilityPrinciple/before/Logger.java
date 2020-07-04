package oops.SOLID.singleResponsibilityPrinciple.before;

public class Logger {

	public void logInfo(String className, String msg) {
		System.out.println(className + " Info: " + msg);
	}

	public void logError(String className, Exception e) {
		System.out.println(className + " Error: " + e.getMessage());
		e.printStackTrace();
	}

}
