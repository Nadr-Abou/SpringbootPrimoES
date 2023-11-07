package io.example.secondApp.bootstrap;

import io.example.secondApp.domain.Author;
import io.example.secondApp.domain.Book;
import io.example.secondApp.domain.Publisher;
import io.example.secondApp.repositories.AuthorRepository;
import io.example.secondApp.repositories.BookRepository;
import io.example.secondApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Bootstrap - start");

        Publisher p1 = new Publisher();
        p1.setPublisherName("Nadr");
        p1.setCity("Milano");
        p1.setAddress("via .... 01");
        p1.setZipCode("00000");
        p1.setState("Italia");
        Publisher p1Saved = publisherRepository.save(p1);

        Book b1 = new Book();
        b1.setTitle("Il primo libro"); //crea libro
        b1.setIsbn("6569548484");
        b1.setPublisher(p1Saved);
        Book b1Saved = bookRepository.save(b1); //scrive su database

        System.out.println("Bootstrap - End");
    }

}
