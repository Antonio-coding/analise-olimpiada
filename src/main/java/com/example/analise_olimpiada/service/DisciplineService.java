package com.example.analise_olimpiada.service;

import com.example.analise_olimpiada.model.Discipline;
import com.example.analise_olimpiada.repository.DisciplineRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplineService {

  @Autowired
  private DisciplineRepository disciplineRepository;

  public List<Discipline> getDisciplines() {
    return disciplineRepository.fetchDisciplines();
  }
}
