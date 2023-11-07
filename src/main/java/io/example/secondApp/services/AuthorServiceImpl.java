package io.example.secondApp.services;

import io.example.secondApp.domain.Author;
import io.example.secondApp.repositories.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    @Override
    public Author getFirstAuthor() {
        return authorRepository.findAll().iterator().next();
    }
}
