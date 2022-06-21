package com.example.studentmanagementsystem;

import java.time.LocalDate;
import java.util.UUID;

public class Professor extends Osoba{
    private UUID professorId;

    public Professor(String name, String lastName, LocalDate dateOfBirth, UUID oib, UUID professorId){
        super(name,lastName,dateOfBirth,oib);
        this.professorId=professorId;
    }

    public void setProfessorId(UUID professorId) {
        this.professorId = professorId;
    }

    public UUID getProfessorId() {
        return professorId;
    }
}
