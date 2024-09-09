package com.example.analise_olimpiada.model;

public class Discipline {

  private String code; // Código de 3 letras, ex: "ATH" (Atletismo)

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  private String name;

  // Getters e Setters

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
