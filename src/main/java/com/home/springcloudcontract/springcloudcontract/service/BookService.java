package com.home.springcloudcontract.springcloudcontract.service;

import com.home.springcloudcontract.springcloudcontract.model.Book;

import java.util.List;
import java.util.Optional;

/**
 * Created by marcin.bracisiewicz
 */
public interface BookService {

    Book createNew(Book bookDTO);

    Book update(String isbn, Book book);

    Optional<Book> findByIsbn(String isbn);

    List<Book> findAll();

    void delete(Book book);
}
