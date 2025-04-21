package ma.emsi.charityApp.Service.Impl;


import ma.emsi.charityApp.entities.Event;
import ma.emsi.charityApp.repositories.EventRepository;
import ma.emsi.charityApp.Service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event editEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public void deleteEvent(int id) {
        eventRepository.deleteById((long) id);
    }

    @Override
    public Event getEventById(int id) {
        return eventRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Event> getAllEvents() {
        return (List<Event>) eventRepository.findAll();
    }
}
