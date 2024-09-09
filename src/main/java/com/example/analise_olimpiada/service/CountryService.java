package com.example.analise_olimpiada.service;
 
import com.seuprojeto.olimpiada.entidades.Country;
import com.seuprojeto.olimpiada.repositorios.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;
import java.util.Optional;
 
@Service
public class CountryService {
 
    @Autowired
    private CountryRepository countryRepository;

    
    public Optional<Country> findByCode(String code) {
        return countryRepository.findByCode(code);
    }

 
    public List<Country> listAll() {
        return countryRepository.findAll();
    }
 
    public Optional<Country> findById(Long id) {
        return countryRepository.findById(id);
    }
 
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }
 
    public Country updateCountry(Long id, Country updatedCountry) {
        return countryRepository.findById(id)
                .map(country -> {
                    country.setName(updatedCountry.getName());
                    return countryRepository.save(country);
                })
                .orElseThrow(() -> new RuntimeException("Country not found"));
    }
 
    public void deleteCountry(Long id) {
        countryRepository.deleteById(id);
    }
}