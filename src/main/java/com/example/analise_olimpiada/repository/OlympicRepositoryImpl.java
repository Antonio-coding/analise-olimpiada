package com.example.analise_olimpiada.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.example.analise_olimpiada.model.Discipline;

import java.util.Arrays;
import java.util.List;

@Repository
public class OlympicRepositoryImpl implements OlympicRepository {

    private static final String BASE_URL = "https://apis.codante.io/olympic-games";

    @Autowired
    private RestTemplate restTemplate;



    @Override
    public List<Discipline> fetchDisciplines() {
        String url = BASE_URL + "/disciplines";
        Discipline[] disciplines = restTemplate.getForObject(url, Discipline[].class);
        return Arrays.asList(disciplines);
    }
}
