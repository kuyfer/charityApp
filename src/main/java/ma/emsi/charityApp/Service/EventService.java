package ma.emsi.charityApp.Service;

import ma.emsi.charityApp.entities.Event;

import java.util.List;

public interface EventService {

    Event addEvent(Event event);

    Event editEvent(Event event);

    void deleteEvent(int id);

    Event getEventById(int id);

    List<Event> getAllEvents();
}
