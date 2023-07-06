package com.example.demo.Db;

import com.example.demo.DatabaseClasses.Author;
import com.example.demo.Repository.AuthorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(AuthorRepository repository){
        return args -> {
            log.info("Preloading " + repository.save(new Author("Ivanov", "Ivan", "Ivanovich", "Ivanich sir")));
            log.info("Preloading " + repository.save(new Author("Viktorov", "Viktor", "Viktorovich", "Vitek")));
        };
    }
}
