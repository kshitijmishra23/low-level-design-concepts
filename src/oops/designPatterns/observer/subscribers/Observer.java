package oops.designPatterns.observer.subscribers;

import oops.designPatterns.observer.Subject;

public abstract class Observer {
	public Subject subject;
	public abstract void update();
}
