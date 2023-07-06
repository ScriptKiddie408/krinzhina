package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TagArticle {
    @Id
    private int id_tag;
    private int id_article;

    public TagArticle(){}

    public TagArticle(int id_tag, int id_article){
        this.id_tag=id_tag;
        this.id_article=id_article;
    }

    public int getId_tag() {return id_tag;}
    public void setId_tag(int id_tag) {this.id_tag = id_tag;}

    public int getId_article() {return id_article;}
    public void setId_article(int id_article) {this.id_article = id_article;}
}
