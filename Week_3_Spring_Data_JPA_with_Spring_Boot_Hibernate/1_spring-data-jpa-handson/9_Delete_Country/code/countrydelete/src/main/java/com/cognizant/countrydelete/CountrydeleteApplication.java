package com.cognizant.countrydelete;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.countrydelete.service.CountryService;

@SpringBootApplication
public class CountrydeleteApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountrydeleteApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        countryService.deleteCountry("IN"); // delete country with co_code 'IN'
    }
}
