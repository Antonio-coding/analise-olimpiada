package com.example.analise_olimpiada.controller;

import com.example.analise_olimpiada.model.Venue;
import com.example.analise_olimpiada.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venues")
public class VenueController {

  @Autowired
  private VenueService venueService;

  @GetMapping
  public Venue[] getVenues() {
    return venueService.getVenues();
  }
}
