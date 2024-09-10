package com.example.analise_olimpiada.controller;

import com.example.analise_olimpiada.model.Discipline;
import com.example.analise_olimpiada.service.DisciplineService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;


@RestController
@RequestMapping("/olympic-games") // Adicione o prefixo aqui
public class DisciplineController {

  @Autowired
  private DisciplineService olympicService;

  @GetMapping("/disciplines")
  public List<Discipline> getDisciplines() {
    return olympicService.getDisciplines();
  }

  // Métodos para filtrar os dados
  @GetMapping("/events")
  public List<Event> getEvents(
    @RequestParam(required = false) String country,
    @RequestParam(required = false) String discipline,
    @RequestParam(required = false) String gender,
    @RequestParam(required = false) String date,
    @RequestParam(required = false) String competitor,
    @RequestParam(required = false) String venue,
    @RequestParam(defaultValue = "1") int page
  ) {
    return null; // Falta implementação
  }
}
