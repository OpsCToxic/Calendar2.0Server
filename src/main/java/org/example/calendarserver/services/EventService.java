package org.example.calendarserver.services;

import org.example.calendarserver.models.Event;
import org.example.calendarserver.repositories.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    // Retrieve all events
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    // Create a new event
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    // Update an existing event
    public Event updateEvent(Long id, Event eventDetails) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id " + id));
        event.setName(eventDetails.getName());
        event.setDetails(eventDetails.getDetails());
        event.setStart(eventDetails.getStart());
        event.setEnd(eventDetails.getEnd());
        event.setColor(eventDetails.getColor());
        event.setAllDay(eventDetails.getAllDay());
        return eventRepository.save(event);
    }

    // Delete an event
    public void deleteEvent(Long id) {
        Event event = eventRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Event not found with id " + id));
        eventRepository.delete(event);
    }
}
