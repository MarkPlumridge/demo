package com.example.demo;

public class Book {

    private String title;
    private String author;
    private int rating;

    public Book(String title, String author, int rating) {
        this.title = title;
        this.author = author;
        this.rating = rating;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

}
