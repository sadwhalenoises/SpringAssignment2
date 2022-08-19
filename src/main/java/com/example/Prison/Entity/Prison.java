package com.example.Prison.Entity;

import javax.persistence.*;

@Entity
public class Prison {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int inmateId;
    private String inmateName;

    public Prison(){

    }

    public Prison(String inmateName) {
        this.inmateName = inmateName;
    }

    public int getInmateId() {
        return inmateId;
    }

    public void setInmateId(int inmateId) {
        this.inmateId = inmateId;
    }

    public String getInmateName() {
        return inmateName;
    }

    public void setInmateName(String inmateName) {
        this.inmateName = inmateName;
    }
}
