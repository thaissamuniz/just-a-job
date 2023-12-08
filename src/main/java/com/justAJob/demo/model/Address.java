package com.justAJob.demo.model;
import lombok.Data;

@Data
public class Address {
    private String cep;
    private String streetName;
    private int number;
    private String city;
    private String neighborhood;
    private String complement;

    public Address(String cep, String streetName, int number, String city, String neighborhood, String complement) {
        this.cep = cep;
        this.streetName = streetName;
        this.number = number;
        this.city = city;
        this.neighborhood = neighborhood;
        this.complement = complement;
    }
}
