package assignment2;

import assignment2.model.PriceRange;

public class Filter {

    private String title;
    private String genre;
    private PriceRange priceRange;
    private String language;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre == null ? null : genre.toLowerCase();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.toLowerCase();
    }

    public PriceRange getPriceRange() {
        return priceRange;
    }

    public void setPrice(String price) {
        if(price == null)
            return;
        String values[] = price.split(":");
        this.priceRange = new PriceRange(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }
}
