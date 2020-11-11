package oops.designPatterns.prototype;

import oops.designPatterns.prototype.items.Movie;
import oops.designPatterns.prototype.items.Book;

public class PrototypeDemo {

	public static void main(String[] args) {
		Registry registry = Registry.getInstance();
		Movie movie = (Movie) registry.createItem("Movie");
		if(movie != null) {
			movie.setTitle("The Prestige");
			System.out.println(movie);
			System.out.println(movie.getRuntime());
			System.out.println(movie.getTitle());
			System.out.println(movie.getUrl());
		}
		Movie anotherMovie =  (Movie) registry.createItem("Movie");
		if(anotherMovie != null) {
			anotherMovie.setTitle("Gang of Wassepur");			
			System.out.println(anotherMovie);
			System.out.println(anotherMovie.getRuntime());
			System.out.println(anotherMovie.getTitle());
			System.out.println(anotherMovie.getUrl());			
		}
		anotherMovie =  (Movie) registry.createItem("ArtMovie");
		if(anotherMovie != null) {
			anotherMovie.setTitle("Gang of Wassepur");			
			System.out.println(anotherMovie);
			System.out.println(anotherMovie.getRuntime());
			System.out.println(anotherMovie.getTitle());
			System.out.println(anotherMovie.getPrice());			
		}		
		
		Book newBook = (Book) registry.createItem("Book");
		if(newBook != null) {
			anotherMovie.setTitle("Gang of Wassepur");			
			System.out.println(newBook);
			System.out.println(newBook.getNumberOfPages());
			System.out.println(newBook.getTitle());
			System.out.println(newBook.getPrice());
		}
	}
}
