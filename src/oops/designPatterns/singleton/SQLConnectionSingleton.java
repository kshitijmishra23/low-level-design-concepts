package oops.designPatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectionSingleton { 
	private static SQLConnectionSingleton instance = null;
	private static Connection connection = null;
	
	private SQLConnectionSingleton() {
		if(instance != null) {
			
			throw new RuntimeException("Use getInstance method!");
		}
	}
	
	public static SQLConnectionSingleton getInstance() {
		if(instance == null) {
			instance = SqlConnectionSingletonInstanceProvider.INSTANCE;
		}
		return instance;
	}
	
	public Connection getConnection() {
		if(connection == null) {
			String connectionUrl = "jdbc:mysql://localhost:3306/development";
			try {
			connection  =  DriverManager.getConnection(connectionUrl,"root","");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
	
	/**
	 * Private inner static class to provide the object.
	 * This also works in multi-threaded environment as a class is loaded
	 * only once.
	 * @author Kalyan
	 *
	 */
	private static class SqlConnectionSingletonInstanceProvider {
		
		private static SQLConnectionSingleton INSTANCE = new SQLConnectionSingleton();
		
	}
} 