package com.home.springcloudcontract.springcloudcontract.repository;

import com.home.springcloudcontract.springcloudcontract.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created by marcin.bracisiewicz
 */
public interface BookRepository extends JpaRepository<Book,String> {

}
