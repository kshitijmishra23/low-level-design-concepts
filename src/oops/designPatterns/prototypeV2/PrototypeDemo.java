package oops.designPatterns.prototypeV2;

import oops.designPatterns.prototypeV2.items.Book;
import oops.designPatterns.prototypeV2.items.Movie;

public class PrototypeDemo {
    public static void main(String[] args){
        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("ArtMovie");
        movie.setRuntime("3 Hours");
        movie.setTitle("Gang of Wassypur");

        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());

        Book book = (Book) registry.createItem("Book");
        book.setNoOfPage(200);
        book.setTitle("Fault in our stars");

        System.out.println(book);
        System.out.println(book.getNoOfPage());
        System.out.println(book.getTitle());
    }
}
