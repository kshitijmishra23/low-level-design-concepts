package assignment2.event;

import assignment2.model.Event;
import assignment2.model.PriceRange;

import java.util.Collection;

public interface IEventRepository {

    Collection<Event> getEvents(String genre, PriceRange priceRange);

    void updateEvents(Collection<Event> events);
}
