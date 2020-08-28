package assignment2.service;

import assignment2.Filter;
import assignment2.event.EventRepository;
import assignment2.model.Event;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EventService {

    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> fetchEvents(Filter filter) {

        Collection<Event> eventCollection = eventRepository.getEvents(filter.getGenre(), filter.getPriceRange());
        Stream<Event> eventStream = eventCollection.size() < 1e5 ? eventCollection.stream() : eventCollection.parallelStream();

        return eventStream
                .filter(event -> filter.getTitle() == null || event.getTitle().equals(filter.getTitle()))
                .filter(event -> filter.getLanguage() == null || event.getLanguage().equals(filter.getLanguage()))
                .collect(Collectors.toList());
    }

    public boolean addOrUpdateEvents(List<Event> eventList) {

        try {
            eventRepository.updateEvents(eventList);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
