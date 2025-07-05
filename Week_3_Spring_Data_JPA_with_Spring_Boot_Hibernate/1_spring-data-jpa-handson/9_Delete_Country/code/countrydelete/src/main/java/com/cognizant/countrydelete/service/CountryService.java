package com.cognizant.countrydelete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.countrydelete.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public void deleteCountry(String code) {
        System.out.println("Deleting country with code: " + code);
        countryRepository.deleteById(code);
    }
}
