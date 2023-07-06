package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Tag {
    @Id
    @GeneratedValue
    private int id;
    private int name;

    public Tag(){}

    public Tag (int name){
        this.name=name;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public int getName() {return name;}
    public void setName(int name) {this.name = name;}
}
