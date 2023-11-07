package io.example.secondApp.services;

import io.example.secondApp.domain.Publisher;
import org.springframework.stereotype.Service;

public interface PublisherService {
    Iterable<Publisher> getAllPublisher();
    Publisher getFirstPublisher();
}
