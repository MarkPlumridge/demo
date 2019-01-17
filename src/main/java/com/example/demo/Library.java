package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {

        bookList.add(book);

    }

    public int getBookCount() {

        return bookList.size();

    }

    public List<Book> filterByAuthorStreams(String author) {

        List<Book> bookFilterList =  bookList.stream()
                .filter( (book -> book.getAuthor().equals(author)))
                .collect(Collectors.toList());

        return bookFilterList;
    }


    public List<Book> filterByAuthorForEach(String author) {

        List<Book> filterList = new ArrayList<>();

        for (Book book: bookList) {

            if (book.getAuthor().compareTo(author) == 0)
                filterList.add(book);

        }

        return filterList;
    }
}
