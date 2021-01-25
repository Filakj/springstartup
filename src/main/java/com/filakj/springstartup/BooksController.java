package com.filakj.springstartup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        //hardcode rest service returned book object in json format
        //automatically configured
        return Arrays.asList(new Book(1l,"Making a Spring REST Service", "John Filak"));
    }
}
