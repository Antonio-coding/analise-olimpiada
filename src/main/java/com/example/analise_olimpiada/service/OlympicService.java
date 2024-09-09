package com.example.analise_olimpiada.service;

import com.example.analise_olimpiada.model.Discipline;
import com.example.analise_olimpiada.repository.OlympicRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class OlympicService {

  @Autowired
  private OlympicRepository olympicRepository;

  public List<Discipline> getDisciplines() {
    return olympicRepository.fetchDisciplines();
  }
}
