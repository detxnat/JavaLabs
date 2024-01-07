package com.university.lb1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Choose an option.\n1. Add book\n2. Display all books\n3. Search by title\n4.Remove by ISBN\n5. Exit");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> {
                    System.out.println("Enter name, Author, ISBN, publishing year: ");
                    library.addBook(new Book(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt()));
                    scanner.nextLine();
                }
                case 2 -> library.showAllBooks();
                case 3 -> {
                    System.out.println("Enter title to find:");
                    library.findBookViaName(scanner.nextLine());
                }
                case 4 -> {
                    System.out.println("Enter ISBN to remove");
                    library.removeBook(scanner.nextLine());
                }
                case 5 -> {
                    return;
                }
                default -> System.out.println("Invalid option.Choose another");
            }
        }

    }
}
