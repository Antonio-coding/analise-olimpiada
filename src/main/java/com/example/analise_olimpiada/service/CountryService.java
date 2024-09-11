package com.example.analise_olimpiada.service;

import com.example.analise_olimpiada.model.Country;
import com.example.analise_olimpiada.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries() {
        return countryRepository.fetchCountries();
    }
}
