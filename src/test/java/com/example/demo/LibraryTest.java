package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {

        library = new Library();

        Book cleanCode = new Book("Clean Code", "Robert C. Martin", 10);
        Book effectiveJava = new Book("Effective Java", "Joshua Bloch", 9);

        library.addBook(cleanCode);
        library.addBook(effectiveJava);

    }

    @Test
    @DisplayName("addBook to Library")
    void addBookToLibrary() {

        Book cleanArchitecture = new Book("Clean Architecture", "Robert C. Martin", 10);

        library.addBook(cleanArchitecture);

        assertEquals(3, library.getBookCount(), "Invalid number of books in library");


    }

    @Test
    @DisplayName("Filter By Author (Streams method)")
    void testFilterByAuthorStreams() {

        Book cleanArchitecture = new Book("Clean Architecture", "Robert C. Martin", 10);

        library.addBook(cleanArchitecture);

        List<Book> bookList = library.filterByAuthorStreams("Robert C. Martin");

        assertEquals(2, bookList.size(), "Invalid filter of books");

        bookList.stream().forEach((book) -> System.out.println(book.toString()));

    }

    @Test
    @DisplayName("Test filter For each method")
    void testFilterByAuthorForEach() {

        Book cleanArchitecture = new Book("Clean Architecture", "Robert C. Martin", 10);

        library.addBook(cleanArchitecture);

        List<Book> bookList = library.filterByAuthorForEach("Robert C. Martin");

        assertEquals(2, bookList.size(), "Invalid filter of books");

        bookList.stream().forEach((book) -> System.out.println(book.toString()));

    }

}
