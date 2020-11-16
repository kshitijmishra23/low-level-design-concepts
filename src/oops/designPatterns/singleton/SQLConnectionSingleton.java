package oops.designPatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectionSingleton implements SqlConnection {
	private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/development";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";


	private static SQLConnectionSingleton instance = null;
	private static Connection connection = null;
	
	private SQLConnectionSingleton() {
		if(instance != null) {
			throw new RuntimeException("Use getInstance method!");
		}
	}
	
	public static SQLConnectionSingleton getInstance() {
		if(instance == null) {
			synchronized(SQLConnectionSingleton.class) {
				if(instance == null){
					instance = new SQLConnectionSingleton();
				}
			}
		}
		return instance;
	}
	
	public Connection getConnection() {
		if(connection == null) {
			try {
				connection = DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}
} 