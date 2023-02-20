package com.UpcomingEvents.UpcomingEvents.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UpcomingEvents.UpcomingEvents.models.Event;
import com.UpcomingEvents.UpcomingEvents.payloads.EventPayload;
import com.UpcomingEvents.UpcomingEvents.services.EventService;



@RestController
@RequestMapping(path = "/api/events")
public class EventController {
    private EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Event> getAll() {
        return service.getAll();
        
    }

    @GetMapping(path = "/{id}")
    public Event getOne(@PathVariable Long id){
        return service.getOne(id);
    }

    @PostMapping(path = "")
    public void save(@RequestBody EventPayload event){
        service.save(event);
    }
    
    
}

