package com.filakj.springstartup;

public class Book {
    long id;
    String name;
    String Author;

    public Book(long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        Author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
