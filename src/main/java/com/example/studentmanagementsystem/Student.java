package com.example.studentmanagementsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Student extends Osoba {
    private UUID studentId;
    private ArrayList<Subject> listaPredmetSocjenom;

    public Student(String name,
                   String lastName,
                   LocalDate dateOfBirth,
                   UUID oib,
                   UUID studentId,
                   ArrayList<Subject> ocjene)
    {
        super(name,lastName,dateOfBirth,oib);
        this.studentId=studentId;
        this.listaPredmetSocjenom=ocjene;
    }

    public void setOcjene(ArrayList<Subject> ocjene) {
        this.listaPredmetSocjenom = ocjene;
    }

    public void setStudentId(UUID studentId) {
        this.studentId = studentId;
    }

    public UUID getStudentId() {
        return studentId;
    }

    public ArrayList<Subject> getOcjene() {
        return listaPredmetSocjenom;
    }
}
