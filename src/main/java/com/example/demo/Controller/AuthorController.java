package com.example.demo.Controller;

import com.example.demo.DatabaseClasses.Author;
import com.example.demo.Exceptions.AuthorNotFoundException;
import com.example.demo.Repository.AuthorRepository;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
public class AuthorController {
    private final AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @GetMapping("/authors")
    List<Author> all(){
        return authorRepository.findAll();
    }

    @GetMapping("/author/{id}")
    Author one(@PathVariable int id){
        return authorRepository.findById(id).orElseThrow(() -> new AuthorNotFoundException(id));
    }

    @PostMapping("/addAuthor")
    Author newAuthor(@RequestBody Author newAuthor){
        return authorRepository.save(newAuthor);
    }

    @PutMapping("/updateAuthor/{id}")
    Author replaceEmployee(@RequestBody Author newAuthor, @PathVariable int id){
        return authorRepository.findById(id)
                .map(author -> {
                    author.setFirst_name(newAuthor.getFirst_name());
                    author.setMiddle_name(newAuthor.getMiddle_name());
                    author.setLast_name(newAuthor.getLast_name());
                    author.setInfo(newAuthor.getInfo());
                    return authorRepository.save(author);
                })
                .orElseGet(() -> {
                    newAuthor.setId(id);
                    return authorRepository.save(newAuthor);
                });
    }


    @DeleteMapping("/delAuthor")
    void deleteAuthor(@PathVariable int id){
        authorRepository.deleteById(id);
    }
}
