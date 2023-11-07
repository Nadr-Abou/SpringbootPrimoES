package io.example.secondApp.services;

import io.example.secondApp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();

    Book getFirstBook();

    Book getByID(long id);
}
