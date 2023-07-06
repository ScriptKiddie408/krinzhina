package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AuthorArticle {
    @Id
    public int id_author;
    public int id_article;
    public int id_author_type;

    public AuthorArticle(){}

    public AuthorArticle(int id_author, int id_article, int id_author_type){
        this.id_author=id_author;
        this.id_article=id_article;
        this.id_author_type=id_author_type;
    }

    public int getId_author() {return id_author;}
    public void setId_author(int id_author) {this.id_author = id_author;}

    public int getId_article() {return id_article;}
    public void setId_article(int id_article) {this.id_article = id_article;}

    public int getId_author_type() {return id_author_type;}
    public void setId_author_type(int id_author_type) {this.id_author_type = id_author_type;}
}
