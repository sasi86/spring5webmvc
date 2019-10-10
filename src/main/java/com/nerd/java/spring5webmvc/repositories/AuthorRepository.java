package com.nerd.java.spring5webmvc.repositories;

import com.nerd.java.spring5webmvc.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
