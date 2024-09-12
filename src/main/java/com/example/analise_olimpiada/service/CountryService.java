package com.example.analise_olimpiada.service;

import com.example.analise_olimpiada.model.Country;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CountryService {
    private final String BASE_URL = "https://apis.codante.io/olympic-games/countries";
    private final RestTemplate restTemplate = new RestTemplate();

    public Country[] getCountries() {
        return restTemplate.getForObject(BASE_URL, Country[].class);
    }
}


