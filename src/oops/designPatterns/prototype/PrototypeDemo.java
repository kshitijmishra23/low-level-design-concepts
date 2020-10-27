package oops.designPatterns.prototype;

import oops.designPatterns.prototype.items.Movie;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = Registry.getInstance();
		Movie movie = (Movie) registry.createItem("ArtMovie");
		movie.setTitle("The Prestige");
		
		System.out.println(movie);
		System.out.println(movie.getRuntime());
		System.out.println(movie.getTitle());
		System.out.println(movie.getUrl());
		
		Movie anotherMovie =  (Movie) registry.createItem("ShortMovie");
		anotherMovie.setTitle("Gang of Wassepur");
		
		System.out.println(anotherMovie);
		System.out.println(anotherMovie.getRuntime());
		System.out.println(anotherMovie.getTitle());
		System.out.println(anotherMovie.getUrl());

		Registry registry1 = Registry.getInstance();
//		Registry registry2 = new Registry();
	}

}
