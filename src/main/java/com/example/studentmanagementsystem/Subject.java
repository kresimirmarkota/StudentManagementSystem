package com.example.studentmanagementsystem;

public class Subject {
    private Professor nositeljPredmeta;
    private int postignutaOcjena;
    private String nazivPredmeta;

public Subject(Professor nositeljPredmeta, int postignutaOcjena, String nazivPredmeta){
    this.nositeljPredmeta=nositeljPredmeta;
    this.postignutaOcjena=postignutaOcjena;
    this.nazivPredmeta=nazivPredmeta;
}
    public void setNositeljPredmeta(Professor nositeljPredmeta) {
        this.nositeljPredmeta = nositeljPredmeta;
    }

    public void setOcjena(int ocjena) {
        this.postignutaOcjena = ocjena;
    }

    public int getOcjena() {
        return postignutaOcjena;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setPostignutaOcjena(int postignutaOcjena) {
        this.postignutaOcjena = postignutaOcjena;
    }

    public int getPostignutaOcjena() {
        return postignutaOcjena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public Professor getNositeljPredmeta() {
        return nositeljPredmeta;
    }
}
