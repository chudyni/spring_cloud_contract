package com.home.springcloudcontract.springcloudcontract.service.impl;

import com.home.springcloudcontract.springcloudcontract.model.Book;
import com.home.springcloudcontract.springcloudcontract.repository.BookRepository;
import com.home.springcloudcontract.springcloudcontract.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by marcin.bracisiewicz
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public Book createNew(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book update(String isbn, Book book) {
        Optional<Book> retrievedBook = bookRepository.findById(isbn);
        if (retrievedBook.isPresent()) {
            Book b = retrievedBook.get();
            b.setAuthor(book.getAuthor());
            b.setTitle(book.getTitle());
            return bookRepository.save(b);
        }
        return null;
    }


    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return bookRepository.findById(isbn);

    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll()
                .stream()
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Book book) {
        bookRepository.delete(book);
    }
}
