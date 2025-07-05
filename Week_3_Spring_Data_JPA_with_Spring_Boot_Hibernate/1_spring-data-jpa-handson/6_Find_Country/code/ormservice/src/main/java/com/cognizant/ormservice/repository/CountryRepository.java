package com.cognizant.ormservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cognizant.ormservice.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {
}
