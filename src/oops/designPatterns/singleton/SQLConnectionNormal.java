package oops.designPatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectionNormal { 
	
	private static Connection connection = null;
	
	
	public Connection getConnection() {
		
			String connectionUrl = "jdbc:mysql://localhost:3306/development";
			try {
				connection  =  DriverManager.getConnection(connectionUrl,"root","");
			}
			catch(SQLException e) {
				System.out.println("not successfull");
				e.printStackTrace();
			}
		
		return connection;
	}
} 