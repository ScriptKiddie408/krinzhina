package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ResourceType {
    @Id
    @GeneratedValue
    private int id;
    private String type_name;

    public ResourceType(){}

    public ResourceType(String type_name){
        this.type_name=type_name;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getType_name() {return type_name;}
    public void setType_name(String type_name) {this.type_name = type_name;}
}
