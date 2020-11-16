package oops.designPatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectionNormal implements SqlConnection {
	private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/development";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	
	private static Connection connection = null;


	public Connection getConnection() {
		try {
			connection  =  DriverManager.getConnection(CONNECTION_URL, USERNAME, PASSWORD);
		}
		catch(final SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
} 