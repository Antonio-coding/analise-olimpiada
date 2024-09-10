package com.example.analise_olimpiada.controller;

import com.example.analise_olimpiada.model.Country;
import com.example.analise_olimpiada.service.CountryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/olympic-games/countries") // Specific base path for countries
public class CountryController {

  @Autowired
  private CountryService countryService;

  @GetMapping
  public List<Country> listAllCountries() {
    return countryService.listAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Country> findCountryById(@PathVariable Long id) {
    Optional<Country> country = countryService.findById(id);
    return country
      .map(ResponseEntity::ok)
      .orElse(ResponseEntity.notFound().build());
  }

  @GetMapping("/code/{code}")
  public ResponseEntity<Country> findCountryByCode(@PathVariable String code) {
    Optional<Country> country = countryService.findByCode(code);
    return country
      .map(ResponseEntity::ok)
      .orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public Country addCountry(@RequestBody Country country) {
    return countryService.addCountry(country);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Country> updateCountry(
    @PathVariable Long id,
    @RequestBody Country country
  ) {
    try {
      Country updatedCountry = countryService.updateCountry(id, country);
      return ResponseEntity.ok(updatedCountry);
    } catch (RuntimeException e) {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteCountry(@PathVariable Long id) {
    countryService.deleteCountry(id);
    return ResponseEntity.noContent().build();
  }
}
