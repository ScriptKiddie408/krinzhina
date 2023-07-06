package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ExternalResource {
    @Id
    @GeneratedValue
    private int id;
    private String link;
    private String readable_link;
    private int id_resource_type;
    private String description;

    private ExternalResource(){}

    private ExternalResource(String link, String readable_link, int id_resource_type, String description){
        this.link=link;
        this.readable_link=readable_link;
        this.id_resource_type=id_resource_type;
        this.description=description;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getLink() {return link;}
    public void setLink(String link) {this.link = link;}

    public String getReadable_link() {return readable_link;}
    public void setReadable_link(String readable_link) {this.readable_link = readable_link;}

    public int getId_resource_type() {return id_resource_type;}
    public void setId_resource_type(int id_resource_type) {this.id_resource_type = id_resource_type;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
}
