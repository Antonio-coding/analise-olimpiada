package com.example.analise_olimpiada.controller;

import com.example.analise_olimpiada.model.Discipline;
import com.example.analise_olimpiada.service.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/olympic-games")
public class DisciplineController {

    @Autowired
    private DisciplineService disciplineService;

    @GetMapping("/disciplines")
    public List<Discipline> getDisciplines() {
        return disciplineService.getDisciplines();
    }
}
