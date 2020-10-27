package oops.designPatterns.prototype;

import oops.designPatterns.prototype.books.AudioBook;
import oops.designPatterns.prototype.books.Book;
import oops.designPatterns.prototype.books.TextBook;
import oops.designPatterns.prototype.registry.BookRegistry;
import oops.designPatterns.prototype.registry.VideoRegistry;
import oops.designPatterns.prototype.videos.Clip;
import oops.designPatterns.prototype.videos.Movie;
import oops.designPatterns.prototype.videos.Video;
import oops.designPatterns.prototype.videos.WebSeries;
import org.w3c.dom.Text;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class PrototypeDemoV2 {
    public static void main(String[] args){
        BookRegistry bookRegistry = BookRegistry.getInstance();
        // Audio Book
        AudioBook audioBook = (AudioBook) bookRegistry.createBook("AudioBook");
        audioBook.setTitle("Power of Now");
        audioBook.setAuthor("Eckhart Tolle");
        audioBook.setNarrator("Eckhart Tolle");
        audioBook.setRuntime("9 hrs");
        System.out.println(audioBook.getTitle());
        System.out.println(audioBook);

        // Text Book
        TextBook textBook = (TextBook) bookRegistry.createBook("TextBook");
        textBook.setNumberOfPage(250);
        textBook.setTitle("Power of Now");
        textBook.setAuthor("Eckhart Tolle");
        textBook.setDateOfPrint(java.time.LocalDate.now());
        System.out.println(textBook.getTitle());
        System.out.println(textBook);

        VideoRegistry videoRegistry = VideoRegistry.getInstance();
        // Video Clip
        Clip clip = (Clip) videoRegistry.createVideo("Clip");
        clip.setTitle("What's in the box");
        clip.setTag("Trending");
        clip.setCreator("Gourab");
        clip.setReleasePlatform("Instagram");
        System.out.println(clip.getTitle());
        System.out.println(clip.getTag());
        System.out.println(clip.getReleasePlatform());
        System.out.println(clip.getRuntime());

        // Web Series
        WebSeries webSeries = (WebSeries) videoRegistry.createVideo("WebSeries");
        webSeries.setTitle("Mirzapur");
        webSeries.setSeasonNumber(1);
        // Casts List
        List<String > casts = new ArrayList<>();
        casts.add("Ali Faizal");
        casts.add("Shweta Singh Tripathi");
        casts.add("Divyenddu Sharma");
        casts.add("Vikrant Massey");
        webSeries.setCasts(casts);
        webSeries.setCreator("Puneet Krishna");
        webSeries.setRuntime("10 hrs");
        webSeries.setReleasePlatform("Amazon Prime Video");
        System.out.println(webSeries.getTitle());
        System.out.println(webSeries.getSeasonNumber());
        System.out.println(webSeries.getCasts());
        System.out.println(webSeries.getReleasePlatform());
        System.out.println(webSeries.getRuntime());

        WebSeries webSeries1 = new WebSeries();
        webSeries1.setTitle("Mirzapur 2");
        casts = webSeries.getCasts();
        // Update casts
        casts.removeIf(cast -> cast == "Vikrant Massey");
        webSeries1.setCasts(casts);
        webSeries1.setSeasonNumber(2);
        webSeries1.setRuntime("9:40");
        webSeries1.setReleasePlatform("Amazon Prime Video");
        System.out.println(webSeries1.getTitle());
        System.out.println(webSeries1.getSeasonNumber());
        System.out.println(webSeries1.getCasts());
        System.out.println(webSeries1.getReleasePlatform());
        System.out.println(webSeries1.getRuntime());

        // Movie
        Movie movie = (Movie) videoRegistry.createVideo("Movie");
        movie.setDirector("Raju Hirani");
        movie.setReleasePlatform("Hotstar");
        movie.setCreator("Raju Hirani");
        movie.setTitle("3 Idiots");
        movie.setRuntime("2:40 hrs");
        // Movie casts
        List<String> movieCasts = new ArrayList<String>();
        movieCasts.add("Amir Khan");
        movieCasts.add("Madhavan");
        movieCasts.add("Kareen Kapoor Khan");
        movieCasts.add("Javed Jaffri");
        movie.setCasts(movieCasts);

        System.out.println(movie.getTitle());
        System.out.println(movie.getCasts());
        System.out.println(movie.getReleasePlatform());
        System.out.println(movie.getRuntime());

    }
}
