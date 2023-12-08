package com.justAJob.demo.model;

public class Cleaner extends Employee{

    private boolean available;
    private int workedHoursPerWeek;

    public Cleaner(String name, double salary, String department, String role, Address address, String tel, boolean available, int workedHoursPerWeek) {
        super(name, salary, department, role, address, tel);
        this.available = available;
        this.workedHoursPerWeek = workedHoursPerWeek;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getWorkedHoursPerWeek() {
        return workedHoursPerWeek;
    }

    public void setWorkedHoursPerWeek(int workedHoursPerWeek) {
        this.workedHoursPerWeek = workedHoursPerWeek;
    }

    public void generateWeeklySchedule() {
    }

    public int calculateHoursWorkedPerWeek() {
        return 0;
    }
}
