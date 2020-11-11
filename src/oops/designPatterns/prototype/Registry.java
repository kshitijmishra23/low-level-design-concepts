package oops.designPatterns.prototype;


import java.util.HashMap;
import java.util.Map;

import oops.designPatterns.prototype.items.Book;
import oops.designPatterns.prototype.items.Item;
import oops.designPatterns.prototype.items.Movie;

//Singleton
public class Registry {

	private static Registry registryObject = null;
	private Map<String, Item> items = new HashMap<String, Item>();
	
	private Registry() {
		loadItems();
	}
	
	public static Registry getInstance() {
		if(registryObject == null) {
			registryObject = new Registry();
		}
		return registryObject;
	}
	
	public Item createItem (String type) {
		Item item = null;
		
		try {
			if(items.get(type) != null)
				item = (Item)(items.get(type)).clone();
			else
				System.out.println("Item of type "+ type + "  not present");
			
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return item;
	}
	
	private void loadItems() {
		Movie artmovie = new Movie();
		artmovie.setTitle("Basic Movie");
		artmovie.setPrice(24.99);
		artmovie.setRuntime("2 hours");
		items.put("ArtMovie", artmovie);
		
		Movie shortMovies = new Movie();
		shortMovies.setTitle("Basic Movie");
		shortMovies.setPrice(24.99);
		shortMovies.setRuntime("2 hours");
		items.put("ShortMovie", shortMovies);
		
		Book book = new Book();
		book.setNumberOfPages(335);
		book.setPrice(19.99);
		book.setTitle("Basic Book");
		items.put("Book", book);
	}
}
