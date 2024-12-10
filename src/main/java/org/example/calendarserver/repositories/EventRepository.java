package org.example.calendarserver.repositories;

import org.example.calendarserver.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
