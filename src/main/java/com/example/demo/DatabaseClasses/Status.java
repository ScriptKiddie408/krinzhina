package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Status {
    @Id
    private int id_category;
    private String status_name;

    public Status(){}

    public Status(int id_category, String status_name){
        this.id_category=id_category;
        this.status_name=status_name;
    }

    public int getId_category() {return id_category;}
    public void setId_category(int id_category) {this.id_category = id_category;}

    public String getStatus_name() {return status_name;}
    public void setStatus_name(String status_name) {this.status_name = status_name;}
}
