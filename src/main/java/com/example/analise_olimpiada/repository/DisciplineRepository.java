package com.example.analise_olimpiada.repository;

import com.example.analise_olimpiada.model.Discipline;
import java.util.List;

public interface DisciplineRepository {
    List<Discipline> fetchDisciplines();
    // List<Country> fetchCountries();
}
