package com.cognizant.countrydelete.model;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code")  // maps to DB column 'co_code'
    private String code;

    @Column(name = "co_name")  // maps to DB column 'co_name'
    private String name;

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
