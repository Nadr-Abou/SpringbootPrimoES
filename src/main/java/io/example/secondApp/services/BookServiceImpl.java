package io.example.secondApp.services;

import io.example.secondApp.domain.Book;
import io.example.secondApp.repositories.BookRepository;

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
        return null;
    }
}
