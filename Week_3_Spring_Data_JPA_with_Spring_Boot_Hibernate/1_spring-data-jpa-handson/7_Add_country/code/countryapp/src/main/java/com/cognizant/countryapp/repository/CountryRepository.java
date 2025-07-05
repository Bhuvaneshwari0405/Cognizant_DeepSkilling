package com.cognizant.countryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.countryapp.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
