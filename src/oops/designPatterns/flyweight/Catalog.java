package oops.designPatterns.flyweight;


import java.util.HashMap;
import java.util.Map;

import oops.designPatterns.flyweight.items.Item;

//Catalog acts as a factory and cache for Item flyweight objects
public class Catalog {
	private Map<String, Item> items = new HashMap<String, Item>();

	//factory method
	public Item lookup(String itemName) {
		if (!items.containsKey(itemName.toLowerCase()))
			items.put(itemName.toLowerCase(), new Item(itemName));
		return items.get(itemName.toLowerCase());
	}

	public int totalItemsMade() {
		return items.size();
	}
}