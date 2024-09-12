package com.example.analise_olimpiada.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.analise_olimpiada.model.Discipline;

@Service
public class DisciplineService {
    private final String BASE_URL = "https://apis.codante.io/olympic-games/disciplines";
    private final RestTemplate restTemplate = new RestTemplate();

    public Discipline[] getDisciplines() {
        return restTemplate.getForObject(BASE_URL, Discipline[].class);
    }
}
