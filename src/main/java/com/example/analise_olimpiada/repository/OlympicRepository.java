package com.example.analise_olimpiada.repository;

import com.example.analise_olimpiada.model.Discipline;
import java.util.List;

public interface OlympicRepository {
    List<Discipline> fetchDisciplines();
    // List<Country> fetchCountries();
}
