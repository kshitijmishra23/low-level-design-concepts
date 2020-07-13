package oops.designPatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectionNormal { 
	
	private static Connection connection = null;

	private static SQLConnectionNormal sqlConnectionNormal;

	private SQLConnectionNormal() {
		//Do the heavy work
	}

	public static SQLConnectionNormal getInstance(){
		if(sqlConnectionNormal == null) {
			synchronized (SQLConnectionNormal.class) {
				if(sqlConnectionNormal==null) {
					sqlConnectionNormal = new SQLConnectionNormal();
				}
			}
		}
		return sqlConnectionNormal;
	}
	
	public Connection getConnection() {
		
			String connectionUrl = "jdbc:mysql://localhost:3306/development";
			try {
			connection  =  DriverManager.getConnection(connectionUrl,"root","");
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		
		return connection;
	}
} 