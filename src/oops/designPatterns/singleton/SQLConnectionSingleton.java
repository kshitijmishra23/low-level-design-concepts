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
			instance = new SQLConnectionSingleton();
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
	/*public Connection getConnection() {
		return connection;
	}
	*/
} 