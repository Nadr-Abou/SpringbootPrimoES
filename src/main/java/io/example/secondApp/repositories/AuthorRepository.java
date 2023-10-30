package io.example.secondApp.repositories;

import io.example.secondApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long>{
}
