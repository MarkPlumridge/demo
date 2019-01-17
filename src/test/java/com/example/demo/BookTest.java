package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {


    @Test
    @DisplayName("Test adding book")
    void addBook() {

        Book book = new Book();

        book.setTitle("Clean Code");
        book.setAuthor("Robert C. Martin");
        book.setRating(10);

        assertAll("Test book values",

                ()-> assertEquals("Clean Code", book.getTitle(), "Invalid Title!"),
                ()-> assertEquals("Robert C. Martin", book.getAuthor(), "Invalid Author!"),
                ()-> assertEquals(10, book.getRating(), "Invalid Score!")

        );


    }
}
