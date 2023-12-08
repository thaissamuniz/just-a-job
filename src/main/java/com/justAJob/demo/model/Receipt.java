package com.justAJob.demo.model;

import lombok.Data;

@Data
public class Receipt {
    private double paidPrice;

    public Receipt(double paidPrice) {
        this.paidPrice = paidPrice;
    }

    public void printReceipt() {

    }
}
