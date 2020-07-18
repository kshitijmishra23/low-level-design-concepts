package oops.designPatterns.observer;

import oops.designPatterns.observer.subscribers.PhoneClient;
import oops.designPatterns.observer.subscribers.TabletClient;

public class ObserverDemo {

	public static void main(String args[]) {
		Subject subject = new MessageStream();
		
		PhoneClient phoneClient = new PhoneClient(subject);
		TabletClient tabletClient = new TabletClient(subject);
		
		phoneClient.addMessage("Here is a new message!");
		tabletClient.addMessage("Another new message!");
	}
	
}
