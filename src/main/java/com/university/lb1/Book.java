package com.university.lb1;


public class Book {
    private final String name;
    private final String author;
    private final String ISBN;
    private final int yearOfEdition;

    public Book(String name, String author, String ISBN, int yearOfEdition) {
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
        this.yearOfEdition = yearOfEdition;
    }



    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYearOfEdition() {
        return yearOfEdition;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", yearOfEdition=" + yearOfEdition;
    }
}
