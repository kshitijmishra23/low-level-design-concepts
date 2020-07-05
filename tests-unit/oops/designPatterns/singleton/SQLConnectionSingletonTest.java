package oops.designPatterns.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Assert;
import org.junit.Test;


public class SQLConnectionSingletonTest {

	@Test
	public void testGetInstance() {
		SQLConnectionSingleton instance = SQLConnectionSingleton.getInstance();
		SQLConnectionSingleton instance2 = SQLConnectionSingleton.getInstance();
		Assert.assertEquals(instance, instance2);
	}
	
	@Test
	public void testGetInstanceWithMultipleThreads() throws InterruptedException {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<Callable<SQLConnectionSingleton>> callables = new ArrayList<>();
		callables.add(() -> getSingletonInstance());
		callables.add(() -> getSingletonInstance());
		callables.add(() -> getSingletonInstance());
		callables.add(() -> getSingletonInstance());
		callables.add(() -> getSingletonInstance());
		callables.add(() -> getSingletonInstance());
		callables.add(() -> getSingletonInstance());
		callables.add(() -> getSingletonInstance());
		executor.invokeAll(callables);
	}
	
	private SQLConnectionSingleton getSingletonInstance() {
		System.out.println("Executing thread "+Thread.currentThread().getName());
		SQLConnectionSingleton sqlConnection = SQLConnectionSingleton.getInstance();
		System.out.println("Sql connection object is "+sqlConnection);
		return sqlConnection;
	}

}
