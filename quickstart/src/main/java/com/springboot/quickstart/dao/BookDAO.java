package com.springboot.quickstart.dao;

import com.springboot.quickstart.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 94921 on 2019/3/18.
 */
@Component
public class BookDAO {
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Spring Boot实战", 88.7)) ;
        books.add(new Book(2, "Spring Mvc", 88.7)) ;
        books.add(new Book(3, "Spring", 91.9)) ;
        return books;
    }
}
