package oops.designPatterns.singleton;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Supplier;

public class Client {
	
	public void createConnectionUsingNormalConnector() {

		System.out.println("Normal Connection");

		final SqlExecutor executor = timeExecutorCreation(() -> new SqlExecutor(new SQLConnectionNormal()));
		
		try {
	        final ResultSet resultSet = executor.execute("select * from users where id = 169997");
	        while(resultSet.next()) {
	        	System.out.println("id: "+ resultSet.getInt("id"));
	        	System.out.println("name: "+ resultSet.getString("name"));
	        	System.out.println("email: "+ resultSet.getString("email"));
	        	System.out.println("university: "+ resultSet.getString("university"));
	        }
		}catch(SQLException e){
			e.printStackTrace();
		}

		timeExecutorCreation(() -> new SqlExecutor(new SQLConnectionNormal()));
		System.out.println("------------------------------\n");
	}
	
	public void createConnectionUsingSingletonConnector() {
		System.out.println("Singleton Connection");
		final SqlExecutor executor = timeExecutorCreation(() -> new SqlExecutor(SQLConnectionSingleton.getInstance()));
		
		try {
	        final ResultSet resultSet = executor.execute("select * from users where id = 1");
	        while(resultSet.next()) {
	        	System.out.println("id: "+ resultSet.getInt("id"));
	        	System.out.println("name: "+ resultSet.getString("name"));
	        	System.out.println("email: "+ resultSet.getString("email"));
	        	System.out.println("university: "+ resultSet.getString("university"));
	        }
		}catch(SQLException e){
			e.printStackTrace();
		}

		timeExecutorCreation(() -> new SqlExecutor(SQLConnectionSingleton.getInstance()));
		System.out.println("------------------------------\n");
	}

	public static void main(String args[]) {
		Client c1 = new Client(); 
		
		c1.createConnectionUsingNormalConnector();
		c1.createConnectionUsingNormalConnector();
		c1.createConnectionUsingSingletonConnector();
		c1.createConnectionUsingSingletonConnector();
	}

	private SqlExecutor timeExecutorCreation(final Supplier<SqlExecutor> supplier){
		final long startTime = System.currentTimeMillis();
		final SqlExecutor sqlExecutor = supplier.get();
		final long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		return sqlExecutor;
	}
}

