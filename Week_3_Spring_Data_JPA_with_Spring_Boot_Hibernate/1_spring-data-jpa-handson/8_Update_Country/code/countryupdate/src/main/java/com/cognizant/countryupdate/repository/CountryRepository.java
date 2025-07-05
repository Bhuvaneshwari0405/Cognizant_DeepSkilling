package com.cognizant.countryupdate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.countryupdate.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
