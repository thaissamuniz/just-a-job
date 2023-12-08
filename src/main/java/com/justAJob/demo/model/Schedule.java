package com.justAJob.demo.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Schedule {
 private List<Integer> days;

 public List<Integer> getAvailableDays(){
     return new ArrayList<>();
 }

 public void selectDay() {

 }


}
