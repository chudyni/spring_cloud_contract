package com.home.springcloudcontract.springcloudcontract.service;

import com.home.springcloudcontract.springcloudcontract.model.Book;

import java.util.Optional;

/**
 * Created by marcin.bracisiewicz
 */
public interface BookService {

    Book createNew(Book book);
    Book updateBook(String isbn,  Book book);
    Optional<Book> getByIsbn(String isbn);
}
