package io.example.secondApp.bootstrap;

import io.example.secondApp.domain.Author;
import io.example.secondApp.domain.Book;
import io.example.secondApp.repositories.AuthorRepository;
import io.example.secondApp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Bootstrap - start");

        Book b1 = new Book();
        b1.setTitle("Titolo di B1"); //crea libro
        b1.setIsbn("Isbn di B1");

        Book b1Saved = bookRepository.save(b1); //scrive su database

        System.out.println("Bootstrap - End");
    }

}
