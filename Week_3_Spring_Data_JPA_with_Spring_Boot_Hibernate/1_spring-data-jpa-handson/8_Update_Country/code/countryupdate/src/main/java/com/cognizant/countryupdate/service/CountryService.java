package com.cognizant.countryupdate.service;

import com.cognizant.countryupdate.model.Country;
import com.cognizant.countryupdate.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public void updateCountry(String code, String newName) {
        Optional<Country> optionalCountry = countryRepository.findById(code);
        if (optionalCountry.isPresent()) {
            Country country = optionalCountry.get();
            country.setCoName(newName);
            countryRepository.save(country);
        } else {
            System.out.println("Country with code " + code + " not found.");
        }
    }

    public Country findCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }
}
