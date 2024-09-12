package com.example.analise_olimpiada.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.analise_olimpiada.model.Event;

@Service
public class EventService {
    private final String BASE_URL = "https://apis.codante.io/olympic-games/events";
    private final RestTemplate restTemplate = new RestTemplate();

    public Event[] getEvents() {
        return restTemplate.getForObject(BASE_URL, Event[].class);
    }

    public Event getEventById(int id) {
        String url = BASE_URL + "/" + id;
        return restTemplate.getForObject(url, Event.class);
    }
}
