package assignment2;

import assignment2.event.EventRepository;
import assignment2.model.Event;
import assignment2.service.EventService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Tester {

    public static void main(String[] args) {

        EventRepository eventRepository = new EventRepository();
        EventService eventService = new EventService(eventRepository);

        List<Event> events = new ArrayList<>();
        Event event = new Event(1L, 10L, "Bahubali", "Comedy", "English", 300, 10);
        Event event2 = new Event(2L, 11L, "Bahubali", "COMEDY", "French", 300, 10);
        events.add(event);
        events.add(event2);
        eventService.addOrUpdateEvents(events);

        Filter filter = new Filter();
        filter.setGenre("comedy");
        eventService.fetchEvents(filter).stream().forEach(x -> System.out.println(x));
    }
}
