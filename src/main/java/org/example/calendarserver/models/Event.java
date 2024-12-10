package org.example.calendarserver.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "events")
public class Event {
    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    @Column(columnDefinition = "TEXT")
    private String details;

    @Getter
    @Setter
    @Temporal(TemporalType.TIMESTAMP)
    private Date start;

    @Getter
    @Setter
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "end_time") // Changed from 'end' to 'end_time'
    private Date end;

    @Getter
    @Setter
    private String color;

    @Getter
    @Setter
    private Boolean allDay;

    public Event() {}
}