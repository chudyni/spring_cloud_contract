package com.home.springcloudcontract.springcloudcontract;

import com.home.springcloudcontract.springcloudcontract.controller.BookController;
import com.home.springcloudcontract.springcloudcontract.model.Book;
import com.home.springcloudcontract.springcloudcontract.repository.BookRepository;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.StandaloneMockMvcBuilder;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by marcin.bracisiewicz
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
public class BookApiBase {

    @Autowired
    BookController bookController;

    @MockBean
    private BookRepository repository;

    @Before
    public void setup() {
        final Book book = new Book("123", "Jarek", "Piwerko i Socjal");
        when(this.repository.findById(any(String.class))).thenReturn(Optional.of(book));
        when(this.repository.save(any(Book.class))).thenReturn(book);

        final StandaloneMockMvcBuilder standaloneMockMvcBuilder = MockMvcBuilders.standaloneSetup(this.bookController);
        RestAssuredMockMvc.standaloneSetup(standaloneMockMvcBuilder);
    }
}
