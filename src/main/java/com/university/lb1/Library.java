package com.university.lb1;

import java.util.ArrayList;
import java.util.List;


public class Library {

    private final List<Book> library = new ArrayList<>();

    public List<Book> getLibrary() {
        return library;
    }

    public void addBook(Book book){
        library.add(book);
    }

    public void showAllBooks(){
        for (Book book: library) {
            System.out.println(book);
        }
    }

    public Book findBookViaName(String name) throws IllegalArgumentException {
        try{
            Book foundBook = library.stream()
                    .filter(book -> book != null && book.getName() != null && book.getName().equals(name))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException("No a such book with name ->" + name));
            System.out.println("Your book" + foundBook.toString());
            return foundBook;


        }
        catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
            return null;

        }

    }

    public boolean removeBook(String ISBN) throws IllegalArgumentException {


        try {
            if (library.removeIf(book ->book != null && book.getISBN() != null && book.getISBN().equals(ISBN))) {
                System.out.println("Book removed");
                return true;
            } else {
                throw new IllegalArgumentException("Can't remove.No a such book with ISBN ->" + ISBN) ;
            }
        }
        catch (IllegalArgumentException ex){
            System.err.println(ex.getMessage());
            return false;

        }

    }


}
