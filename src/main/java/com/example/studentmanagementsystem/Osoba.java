package com.example.studentmanagementsystem;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public abstract class Osoba {
    protected String name;
    protected String lastName;
    protected LocalDate dateOfBirth;
    protected UUID oib;

    Osoba(String name,String lastName, LocalDate dateOfBirth, UUID oib){
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.oib = oib;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOib(UUID oib) {
        this.oib = oib;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public UUID getOib() {
        return oib;
    }
}
