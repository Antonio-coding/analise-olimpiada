package com.example.analise_olimpiada.repository;

import com.example.analise_olimpiada.model.Country;
import java.util.List;

public interface CountryRepository {
    List<Country> fetchCountries();
}
