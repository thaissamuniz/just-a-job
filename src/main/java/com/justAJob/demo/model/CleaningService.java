package com.justAJob.demo.model;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Data
public class CleaningService {
    private Address address;
    private LocalDateTime quoteDate;
    private LocalDateTime serviceDate;
    private Customer customer;
    private  double price;
    private double deposit;
    private boolean serviceStatus;
    private List<Cleaner> staff;
    private int rate;
}