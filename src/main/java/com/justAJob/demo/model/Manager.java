package com.justAJob.demo.model;

import lombok.Data;

@Data
public class Manager {
    private Schedule schedule;

    public Manager() {
        this.schedule = new Schedule();
    }

    public void printSchedule() {

    }

    public void reserveDate() {

    }
}
