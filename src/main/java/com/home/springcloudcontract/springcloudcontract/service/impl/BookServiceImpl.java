package com.home.springcloudcontract.springcloudcontract.service.impl;

import com.home.springcloudcontract.springcloudcontract.model.Book;
import com.home.springcloudcontract.springcloudcontract.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by marcin.bracisiewicz
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public Book createNew(Book book) {
        return null;
    }

    @Override
    public Book updateBook(String isbn, Book book) {
        return null;
    }

    @Override
    public Optional<Book> getByIsbn(String isbn) {
        return Optional.empty();
    }
}
