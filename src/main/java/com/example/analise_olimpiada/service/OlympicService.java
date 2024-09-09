package com.example.analise_olimpiada.service;

import com.example.analise_olimpiada.model.Discipline;
import com.example.analise_olimpiada.repository.OlympicRepositoryImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OlympicService {

  @Autowired
  private OlympicRepositoryImpl olympicRepository;

  public List<Discipline> getDisciplines() {
    return olympicRepository.fetchDisciplines();
  }
}
