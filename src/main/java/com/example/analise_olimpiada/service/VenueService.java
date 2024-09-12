package com.example.analise_olimpiada.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.analise_olimpiada.model.Venue;

@Service
public class VenueService {
    private final String BASE_URL = "https://apis.codante.io/olympic-games/venues";
    private final RestTemplate restTemplate = new RestTemplate();

    public Venue[] getVenues() {
        return restTemplate.getForObject(BASE_URL, Venue[].class);
    }
}
