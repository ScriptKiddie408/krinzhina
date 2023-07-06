package com.example.demo.DatabaseClasses;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Article {
    @Id
    @GeneratedValue
    private int id;
    private String header;
    private String id_category;
    private String content;
    private LocalDate date_creation;
    private LocalDate date_publication;
    private LocalDate date_end_publication;
    private int editor;
    private int deleted;
    private int status;
    private boolean main_article;
    private boolean publication_avaible;

    public Article(){}

    public Article(String header, String id_category, String content, LocalDate date_creation,
                   LocalDate date_publication, LocalDate date_end_publication, int editor, int deleted,
                   int status, boolean main_article, boolean publication_avaible){
        this.header=header;
        this.id_category=id_category;
        this.content=content;
        this.date_creation=date_creation;
        this.date_publication=date_publication;
        this.date_end_publication=date_end_publication;
        this.editor=editor;
        this.deleted=deleted;
        this.status=status;
        this.main_article=main_article;
        this.publication_avaible=publication_avaible;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getHeader() {return header;}

    public void setHeader(String header) {this.header = header;}

    public String getId_category() {return id_category;}
    public void setId_category(String id_category) {this.id_category = id_category;}

    public String getContent() {return content;}
    public void setContent(String content) {this.content = content;}

    public LocalDate getDate_creation() {return date_creation;}
    public void setDate_creation(LocalDate date_creation) {this.date_creation = date_creation;}

    public LocalDate getDate_publication() {return date_publication;}
    public void setDate_publication(LocalDate date_publication) {this.date_publication = date_publication;}

    public LocalDate getDate_end_publication() {return date_end_publication;}
    public void setDate_end_publication(LocalDate date_end_publication) {this.date_end_publication = date_end_publication;}

    public int getEditor() {return editor;}
    public void setEditor(int editor) {this.editor = editor;}

    public int getDeleted() {return deleted;}
    public void setDeleted(int deleted) {this.deleted = deleted;}

    public int getStatus() {return status;}
    public void setStatus(int status) {this.status = status;}

    public boolean getMain_article() {return main_article;}
    public void setMain_article(boolean main_article) {this.main_article = main_article;}

    public boolean getPublication_avaible() {return publication_avaible;}
    public void setPublication_avaible(boolean publication_avaible) {this.publication_avaible = publication_avaible;}
}
