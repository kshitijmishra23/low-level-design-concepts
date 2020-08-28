package assignment2.model;

import com.sun.tools.attach.AgentInitializationException;

import java.util.Objects;

public class Event {

    private Long eventId;
    private Long screenId;
    private String title;
    private String genre;
    private String language;
    private Integer price;
    private Integer time;

    public Event(Long eventId, Long screenId, String title, String genre, String language, Integer price, Integer time) {
        this.eventId = eventId;
        this.screenId = screenId;
        this.title = title;
        setGenre(genre);
        setLanguage(language);
        this.price = price;
        this.time = time;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }

    public Long getScreenId() {
        return screenId;
    }

    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }

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
        this.genre = genre != null ? genre.toLowerCase() : null;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language != null ? language.toLowerCase() : null;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return eventId.equals(event.eventId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId);
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", screenId=" + screenId +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", language='" + language + '\'' +
                ", price=" + price +
                ", time=" + time +
                '}';
    }
}
