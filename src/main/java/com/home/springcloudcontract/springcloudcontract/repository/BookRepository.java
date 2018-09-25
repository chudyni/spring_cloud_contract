package com.home.springcloudcontract.springcloudcontract.repository;

import com.home.springcloudcontract.springcloudcontract.model.Book;

import java.util.Optional;

/**
 * Created by marcin.bracisiewicz
 */
public interface BookRepository {

    Optional<Book> findById(String id);
    Book save(Book book);
}
