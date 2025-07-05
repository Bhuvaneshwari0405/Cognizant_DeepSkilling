package com.cognizant.countryupdate;

import com.cognizant.countryupdate.model.Country;
import com.cognizant.countryupdate.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryupdateApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryupdateApplication.class, args);
    }

    @Override
    public void run(String... args) {
        testUpdateCountry();
    }

    private void testUpdateCountry() {
        String code = "IN"; // existing country code
        String newName = "Bharat";

        countryService.updateCountry(code, newName);

        Country updated = countryService.findCountryByCode(code);
        System.out.println("Updated country: " + updated.getCoName());
    }
}
