package oops.designPatterns.flyweight.items;

import java.awt.Image;

public class Item {
	String name;
	Image img;
	
	public Item(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
