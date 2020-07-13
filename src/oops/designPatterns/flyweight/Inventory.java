package oops.designPatterns.flyweight;


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import oops.designPatterns.flyweight.items.Item;

public class Inventory {
	
	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<Order>();
	
	void takeOrder(String itemName) {
		Item item = catalog.lookup(itemName);
		Order order = new Order(item);
		orders.add(order);
	}

	void process() {
		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}

	String report() {
		return "\nTotal Item objects made: "
				+ catalog.totalItemsMade();
	}
}