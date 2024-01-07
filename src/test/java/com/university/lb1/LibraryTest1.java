package com.university.lb1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest1 {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testAddBook() {
        //Check of add Method via assertTrue.Creating book, trying to add and ensure that list contains our book.
        Book book = new Book("The Catcher in the Rye", "J.D. Salinger", "9780316769174", 1951);
        library.addBook(book);

        assertTrue(library.getLibrary().contains(book));
    }

    @Test
    void testFindBookViaName() {
        //Check of findBookViaName method.Adding book and then compare results
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084", 1960);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 1925);

        library.addBook(book1);
        library.addBook(book2);

        Book foundBook = library.findBookViaName("To Kill a Mockingbird");
        assertEquals(book1, foundBook);
    }

    @Test
    void testFindBookViaNameNotFound() {
        //Check of findBookViaName method.If book not found method returns null.
        assertNull(library.findBookViaName("Non-existent Book"));
    }

    @Test
    void testRemoveBook() {
        //Remove book from library via removeBook, check what this method returns and ensure that library no more contains this book
        Book book1 = new Book("1984", "George Orwell", "9780451524935", 1949);
        library.addBook(book1);

        library.removeBook("9780451524935");
        assertFalse(library.getLibrary().contains(book1));
    }

    @Test

    void testRemoveBookNotFound() {
        // Checking if method returns false.So there is no such book
        assertFalse(library.removeBook("Non-existent ISBN")
        );
    }
}
