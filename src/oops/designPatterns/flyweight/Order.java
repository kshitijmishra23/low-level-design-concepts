package oops.designPatterns.flyweight;

import oops.designPatterns.flyweight.items.Item;

public class Order {
	private final long orderID;
	private final Item item;
	
	private static long NEW_OID = 0;

	Order(Item item) {
		this.orderID = NEW_OID++;
		this.item = item;
	}

	void processOrder() {
		System.out.println("Ordering " + item.getName() + " for order number " + orderID);
	}
}