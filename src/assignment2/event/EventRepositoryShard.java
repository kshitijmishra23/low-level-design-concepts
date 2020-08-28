package assignment2.event;

import assignment2.model.Event;
import assignment2.model.PriceRange;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

/**
 * Thread safe
 */
public class EventRepositoryShard {

    private ConcurrentSkipListMap<Integer, Queue<Event>> eventSetByPrice = new ConcurrentSkipListMap<>();

    public void addEvent(Event event) {

        // computeIfAbsent happens atomically
        eventSetByPrice.computeIfAbsent(event.getPrice(), i -> new ConcurrentLinkedQueue<>());
        eventSetByPrice.get(event.getPrice()).add(event);
    }

    /**
     * Idempotent operation
     * @param event
     * @return true if an event got removed
     */
    public boolean removeEvent(Event event) {

        Queue<Event> eventSet = eventSetByPrice.get(event.getPrice());
        if(eventSet != null)
            return eventSet.remove(event);
        return false;
    }

    public Set<Event> getEvents(PriceRange priceRange) {

        Collection<Queue<Event>> allEvents = eventSetByPrice.values();    // default to all events, if price range is not specified
        if(priceRange != null)
            allEvents = eventSetByPrice.subMap(priceRange.getBegin(), priceRange.getEnd() + 1).values();

        return new HashSet(allEvents.stream().flatMap(eventSet -> eventSet.stream()).collect(Collectors.toSet()));
    }
}
