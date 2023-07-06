package com.example.demo.DatabaseClasses;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String info;

    public Author(){};

    public Author(String first_name, String middle_name, String last_name, String info){
        this.first_name=first_name;
        this.middle_name=middle_name;
        this.last_name=last_name;
        this.info=info;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getFirst_name() {return first_name;}
    public void setFirst_name(String first_name) {this.first_name = first_name;}

    public String getMiddle_name() {return middle_name;}
    public void setMiddle_name(String middle_name) {this.middle_name = middle_name;}

    public String getLast_name() {return last_name;}
    public void setLast_name(String last_name) {this.last_name = last_name;}

    public String getInfo() {return info;}
    public void setInfo(String info) {this.info = info;}

//    @Override
//    public boolean equals(Object o){
//        if(this == o)
//            return true;
//        if(!(o instanceof Author))
//            return false;
//        Author author = (Author) o;
//        return Objects.equals(this.id, author.id) && Objects.equals(this.first_name, author.first_name)
//                && Objects.equals(this.middle_name, author.middle_name) && Objects.equals(this.last_name, author.last_name)
//                && Objects.equals(this.info, author.info);
//    }
//
//    @Override
//    public int hashCode(){
//        return Objects.hash(this.id, this.first_name, this.middle_name, this.last_name, this.info);
//    }
//
//    @Override
//    public String toString(){
//        return "Author{" + " id=" + this.id + ", first_name '" + this.first_name + '\'' + ", middle_name '" + this.middle_name + '\'' + ", last_name '" + this.last_name + '\'' + ", info ='" + this.info + '\'' + '}';
//    }

}
