package io.example.secondApp.services;

import io.example.secondApp.domain.Author;

public interface AuthorService {
    Iterable<Author> getAllAuthor();

    Author getFirstAuthor();

}
