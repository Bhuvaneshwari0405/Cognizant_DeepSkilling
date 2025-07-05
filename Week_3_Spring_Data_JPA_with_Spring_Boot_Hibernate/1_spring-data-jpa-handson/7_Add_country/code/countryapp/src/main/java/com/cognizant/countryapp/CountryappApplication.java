package com.cognizant.countryapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.cognizant.countryapp.model.Country;
import com.cognizant.countryapp.service.CountryService;

@SpringBootApplication
public class CountryappApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryappApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        testAddCountry();
    }

    public void testAddCountry() {
        Country country = new Country();
        country.setCode("INR");
        country.setName("India Reloaded");

        countryService.addCountry(country);

        Country result = countryService.findCountryByCode("INR");

        if (result != null) {
            System.out.println("✅ Country added successfully: " + result.getName());
        } else {
            System.out.println("❌ Country not found!");
        }
    }
}
