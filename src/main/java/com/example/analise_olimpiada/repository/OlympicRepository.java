package com.example.analise_olimpiada.repository;

import java.util.List;

import com.example.analise_olimpiada.model.Discipline;

public interface OlympicRepository {
    
    List<Discipline> fetchDisciplines();
}
