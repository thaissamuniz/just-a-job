package com.justAJob.demo.model;

import lombok.Data;

@Data
public class Invoice {
    private CleaningService cleaningService;
    private double total;

    public double calculateTotal(double price, double deposit) {
        return 0;
    }
}
