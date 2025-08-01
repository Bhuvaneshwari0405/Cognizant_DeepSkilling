package com.cognizant.countryapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cognizant.countryapp.model.Country;
import com.cognizant.countryapp.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    public Country findCountryByCode(String code) {
        return countryRepository.findById(code).orElse(null);
    }
}
