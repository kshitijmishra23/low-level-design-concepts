package oops.SOLID.DependencyInversionPrinciple.before.notification;

public interface Notifier<T> {
	
	void notify(T e);

}
