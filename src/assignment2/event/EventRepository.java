package assignment2.event;

import assignment2.model.Event;
import assignment2.model.PriceRange;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stateful, thread-safe
 * Organizes events by genre and price range
  */
public class EventRepository implements IEventRepository {

    private Map<String, EventRepositoryShard> eventShardByGenre = new ConcurrentHashMap<>();

    // Atomic operation
    private Consumer<Event> initializeIfAbsent = event -> eventShardByGenre.computeIfAbsent(event.getGenre(), (i) -> new EventRepositoryShard());

    public Collection<Event> getEvents(String genre, PriceRange priceRange) {

        Collection<EventRepositoryShard> relevantShards = new HashSet<>();

        if(genre != null) {
            if(!eventShardByGenre.containsKey(genre))
                throw new RuntimeException("Genre " + genre + " does not exist");
            relevantShards.add(eventShardByGenre.get(genre));
        }
        else
            relevantShards.addAll(eventShardByGenre.values());

        return relevantShards.stream()
                .map(shard -> shard.getEvents(priceRange))
                .flatMap(eventSet -> eventSet.stream())
                .collect(Collectors.toSet());
    }

    /**
     * Upsert events
     * @param events
     */
    public void updateEvents(Collection<Event> events) {

        Stream<Event> stream = events.size() < 1e5 ? events.stream() : events.parallelStream();
        stream.forEach(initializeIfAbsent);
        removeEvents(events);
        addEvents(events);
    }

    private void removeEvents(Collection<Event> events) {

        Stream<Event> stream = events.size() < 1e5 ? events.stream() : events.parallelStream();
        stream.forEach(event -> eventShardByGenre.get(event.getGenre()).removeEvent(event));
    }

    private void addEvents(Collection<Event> events) {

        Stream<Event> stream = events.size() < 1e5 ? events.stream() : events.parallelStream();
        stream.forEach(event -> eventShardByGenre.get(event.getGenre()).addEvent(event));
    }

}
