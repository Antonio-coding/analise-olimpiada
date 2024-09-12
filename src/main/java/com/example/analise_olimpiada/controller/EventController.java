package com.example.analise_olimpiada.controller;

import com.example.analise_olimpiada.model.Event;
import com.example.analise_olimpiada.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
public class EventController {

  @Autowired
  private EventService eventService;

  @GetMapping
  public Event[] getEvents() {
    return eventService.getEvents();
  }

  @GetMapping("/{id}")
  public Event getEventById(@PathVariable int id) {
    return eventService.getEventById(id);
  }
}
