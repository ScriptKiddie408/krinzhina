package com.example.demo.Exceptions;

public class AuthorNotFoundException extends RuntimeException{

    public AuthorNotFoundException(int id){
        super("Could not find author " + id);
    }
}
