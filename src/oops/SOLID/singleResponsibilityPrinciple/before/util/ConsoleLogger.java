package oops.SOLID.singleResponsibilityPrinciple.before.util;

public class ConsoleLogger {
	
	public static final String SEPARATOR = " : ";
	
	public static void info(String message) {
		log(LoggerLevel.INFO, message);
	}
	
	public static void error(String message) {
		log(LoggerLevel.ERROR, message);
	}
	
	public static void debug(String message) {
		log(LoggerLevel.DEBUG, message);
	}
	
	public static void log(LoggerLevel loggerLevel, String message) {
		System.out.println(loggerLevel.toString() + SEPARATOR + message);
	}

}
