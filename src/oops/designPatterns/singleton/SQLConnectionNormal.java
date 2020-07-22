package oops.designPatterns.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnectionNormal { 
	
	private static volatile Connection connection = null;

	public Connection getConnection() {

		String connectionUrl = "jdbc:mysql://localhost:3306/development";
		if(connection == null) {	// to avoid threads from blocking each other when connection already exists

			synchronized (this) {
				if(connection == null)
					try {
						connection = DriverManager.getConnection(connectionUrl, "root", "");
					} catch (SQLException e) {
						e.printStackTrace();
					}
			}
		}
		return connection;
	}
}