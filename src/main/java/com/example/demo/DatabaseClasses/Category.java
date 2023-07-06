package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue
    private int id;
    private String type;

    public Category(){}

    public Category(String type){
        this.type=type;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
}
