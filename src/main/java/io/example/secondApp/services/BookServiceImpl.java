package io.example.secondApp.services;

import io.example.secondApp.domain.Book;
import io.example.secondApp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book getFirstBook() {
        if(bookRepository.count() != 0){
            //return bookRepository;
        }
        return null;
    }
}
