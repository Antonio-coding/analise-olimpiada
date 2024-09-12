package com.example.analise_olimpiada.repository;

import com.example.analise_olimpiada.model.Discipline;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Repository
public class DisciplineRepositoryImpl implements DisciplineRepository {

    @Value("${olympics.api.base-url}")
    private String baseUrl;

    private final RestTemplate restTemplate;

    public DisciplineRepositoryImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Discipline> fetchDisciplines() {
        String url = baseUrl + "/disciplines";
        Discipline[] disciplinesArray = restTemplate.getForObject(url, Discipline[].class);
        return Arrays.asList(disciplinesArray);
    }
}
