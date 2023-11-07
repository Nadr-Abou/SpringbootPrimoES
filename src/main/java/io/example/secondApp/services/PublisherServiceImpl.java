package io.example.secondApp.services;

import io.example.secondApp.domain.Publisher;
import io.example.secondApp.repositories.BookRepository;
import io.example.secondApp.repositories.PublisherRepository;
import org.springframework.stereotype.Service;

@Service
public class PublisherServiceImpl implements PublisherService {
    private final PublisherRepository publisherRepository;

    public PublisherServiceImpl(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @Override
    public Iterable<Publisher> getAllPublisher() {
        return publisherRepository.findAll();
    }

    @Override
    public Publisher getFirstPublisher() {
        return publisherRepository.findAll().iterator().next();
    }


}
