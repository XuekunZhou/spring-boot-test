package com.example.demo.models;

import java.time.LocalDate;
import java.time.Period;

public class Student {
    private int id;
    private String name;
    private String email;
    private LocalDate dob;

    public Student() {

    }

    public Student(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Student(int id, String name, String email, LocalDate dob) {
        this.id= id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        if (dob != null) {
            return Period.between(dob, LocalDate.now()).getYears();
        }
        return 0;
    }
}
