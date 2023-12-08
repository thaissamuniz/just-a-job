package com.justAJob.demo.model;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private String tel;
    private String email;
    private Address address;

    public Customer(String name, String tel, String email, Address address) {
        this.name = name;
        this.tel = tel;
        this.email = email;
        this.address = address;
    }

    public Customer getCustomerInfos() {
        return this;
    }
}
