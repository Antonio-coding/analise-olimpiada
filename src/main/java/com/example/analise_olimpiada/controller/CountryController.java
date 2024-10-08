package com.example.analise_olimpiada.controller;

import com.example.analise_olimpiada.model.Country;
import com.example.analise_olimpiada.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/countries")
public class CountryController {

  @Autowired
  private CountryService countryService;

  @GetMapping
  public Country[] getCountries() {
    return countryService.getCountries();
  }
}
