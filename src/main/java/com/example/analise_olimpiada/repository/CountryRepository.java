package com.example.analise_olimpiada.repository;
 
import com.seuprojeto.olimpiada.entidades.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    Country findByName(String name);
}

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    Optional<Country> findByCode(String code);
}