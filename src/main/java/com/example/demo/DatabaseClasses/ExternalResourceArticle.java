package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ExternalResourceArticle {
    @Id
    private int id_external_resource;
    private int id_article;

    public ExternalResourceArticle(){}

    public ExternalResourceArticle(int id_external_resource, int id_article){
        this.id_external_resource=id_external_resource;
        this.id_article=id_article;
    }

    public int getId_external_resource() {return id_external_resource;}
    public void setId_external_resource(int id_external_resource) {this.id_external_resource = id_external_resource;}

    public int getId_article() {return id_article;}
    public void setId_article(int id_article) {this.id_article = id_article;}
}
