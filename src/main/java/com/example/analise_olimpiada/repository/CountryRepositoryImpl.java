package com.example.analise_olimpiada.repository;

import com.example.analise_olimpiada.model.Country;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    @Value("${olympics.api.base-url}")
    private String baseUrl;

    private final RestTemplate restTemplate;

    public CountryRepositoryImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Country> fetchCountries() {
        String url = baseUrl + "/countries";
        Country[] countriesArray = restTemplate.getForObject(url, Country[].class);
        return Arrays.asList(countriesArray);
    }
}
