package com.nerd.java.spring5webmvc.repositories;

import com.nerd.java.spring5webmvc.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
