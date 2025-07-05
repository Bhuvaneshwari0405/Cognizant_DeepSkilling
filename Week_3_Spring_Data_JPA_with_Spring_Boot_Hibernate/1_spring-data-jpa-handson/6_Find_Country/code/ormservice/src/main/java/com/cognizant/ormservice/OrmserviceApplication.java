package com.cognizant.ormservice;

import com.cognizant.ormservice.model.Country;
import com.cognizant.ormservice.service.CountryService;
import com.cognizant.ormservice.service.exception.CountryNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class OrmserviceApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmserviceApplication.class);

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(OrmserviceApplication.class, args);
    }

    @PostConstruct
    public void testFindCountryByCode() {
        LOGGER.info("Start");

        try {
            Country country = countryService.findCountryByCode("IN");
            LOGGER.debug("Country: {}", country);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: {}", e.getMessage());
        }

        LOGGER.info("End");
    }
}
