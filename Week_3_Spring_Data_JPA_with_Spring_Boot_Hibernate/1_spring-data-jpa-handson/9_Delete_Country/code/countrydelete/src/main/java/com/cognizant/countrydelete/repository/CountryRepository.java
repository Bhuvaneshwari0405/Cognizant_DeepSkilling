package com.cognizant.countrydelete.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.countrydelete.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
