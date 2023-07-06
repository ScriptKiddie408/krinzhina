package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AuthorType {
    @Id
    private int id;
    private String type;

    private AuthorType(){}

    private AuthorType(String type){
        this.type=type;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
}
