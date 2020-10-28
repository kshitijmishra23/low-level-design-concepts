package oops.designPatterns.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Client extends Thread{
	
	public void createConnectionUsingNormalConnector() {
		System.out.println("Normal Connection");
		long timeB = 0;
		long timeA = 0;
		
		timeB = System.currentTimeMillis();
		SQLConnectionNormal sqlconnection =  new SQLConnectionNormal();
		Connection connection = sqlconnection.getConnection();
		timeA = System.currentTimeMillis();
		System.out.println(timeA-timeB);
		
		try {
		 Statement statement = connection.createStatement();
	        String selectSql ="select * from users where id = 2";
	        ResultSet resultSet = statement.executeQuery(selectSql);
	        while(resultSet.next()) {
	        System.out.println("id: "+ resultSet.getInt("id"));
	        System.out.println("name: "+ resultSet.getString("name"));
	        System.out.println("email: "+ resultSet.getString("email"));
	        System.out.println("university: "+ resultSet.getString("university"));
	        }
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		timeB = System.currentTimeMillis();
		SQLConnectionNormal sqlconnection2 = new SQLConnectionNormal();
		Connection connection2 = sqlconnection.getConnection();
		timeA = System.currentTimeMillis();
		System.out.println(timeA-timeB);	
		
		System.out.println("------------------------------\n");
	}
	
	//making the below method as synchronized
	public synchronized void createConnectionUsingSingletonConnector() {
		System.out.println("Singleton Connection");
		long timeB = 0;
		long timeA = 0;
		
		timeB = System.currentTimeMillis();
		SQLConnectionSingleton sqlconnection =  SQLConnectionSingleton.getInstance();
		Connection connection = sqlconnection.getConnection();
		timeA = System.currentTimeMillis();
		System.out.println(timeA-timeB+'\n');
		
		try {
		 Statement statement = connection.createStatement();
	        String selectSql ="select * from users where id = 1";
	        ResultSet resultSet = statement.executeQuery(selectSql);
	        while(resultSet.next()) {
	        System.out.println("id: "+ resultSet.getInt("id"));
	        System.out.println("name: "+ resultSet.getString("name"));
	        System.out.println("email: "+ resultSet.getString("email"));
	        System.out.println("university: "+ resultSet.getString("university"));
	        }
	        Thread.sleep(400);
		}catch(SQLException | InterruptedException e){
			e.printStackTrace();
		}
		
		timeB = System.currentTimeMillis();
		SQLConnectionSingleton sqlconnection2 = SQLConnectionSingleton.getInstance();
		Connection connection2 = sqlconnection.getConnection();
		timeA = System.currentTimeMillis();
		System.out.println(timeA-timeB+'\n');	
		
		System.out.println("------------------------------\n");
	}

	public static void main(String args[]) {
		Client c1 = new Client(); 
		
		c1.createConnectionUsingNormalConnector();
		c1.createConnectionUsingNormalConnector();
		c1.createConnectionUsingNormalConnector();
		c1.createConnectionUsingNormalConnector();

		System.out.println("Using singleton object");
		
//		Client c2 = new Client();
//		c2.createConnectionUsingSingletonConnector();
//		c2.createConnectionUsingSingletonConnector();
//		c2.createConnectionUsingSingletonConnector();
//		c2.createConnectionUsingSingletonConnector();
//		c2.createConnectionUsingSingletonConnector();
//		c1.createConnectionUsingSingletonConnector();
		
		Client c2 = new Client();
		
		//checking with multithreaded environment
		Thread t1 = new Thread(){
			public void run(){
				
				c2.createConnectionUsingSingletonConnector();
				c2.createConnectionUsingSingletonConnector();
				c2.createConnectionUsingSingletonConnector();
				//shows abnormal behaviour as the createConnectionUsingNormalConnector() is not synchronized
				c1.createConnectionUsingNormalConnector();
			}
		};

		Thread t2 = new Thread(){
			public void run(){
				c2.createConnectionUsingSingletonConnector();
				c2.createConnectionUsingSingletonConnector();
				c2.createConnectionUsingSingletonConnector();
				
			}
		};
		
		t1.start();
		t2.start();
	}
}

