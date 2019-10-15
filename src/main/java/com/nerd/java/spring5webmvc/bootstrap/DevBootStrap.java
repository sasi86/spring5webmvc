package com.nerd.java.spring5webmvc.bootstrap;

import com.nerd.java.spring5webmvc.model.Author;
import com.nerd.java.spring5webmvc.model.Book;
import com.nerd.java.spring5webmvc.model.Publisher;
import com.nerd.java.spring5webmvc.repositories.AuthorRepository;
import com.nerd.java.spring5webmvc.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootStrap implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Author author1 = new Author("Eric", "Evans");
        Book book1 = new Book("Domain Driven Design","12345",new Publisher("Publisher 1", "address1"));
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        authorRepository.save(author1);
        //bookRepository.save(book1);

        Author author2 = new Author("Rod", "Johnson");
        Book book2 = new Book("J2EE development without EJB","22345",new Publisher("Manning", "address2"));
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);
        authorRepository.save(author2);
        //bookRepository.save(book2);

    }


}
