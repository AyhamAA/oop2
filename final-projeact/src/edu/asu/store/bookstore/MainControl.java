package edu.asu.store.bookstore;

import java.util.Scanner;

public class MainControl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BookstoreManagementSystem bookstore = new BookstoreManagementSystem();
        boolean x = true;
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add new book");
            System.out.println("2. View catalog");
            System.out.println("3. Manage inventory");
            System.out.println("4. Search by name");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter book type (Fiction/Non-Fiction): ");
                    String type = scanner.next();

                    Book newBook;
                    if (type.equalsIgnoreCase("Fiction")) {
                        newBook = new FictionBook(title, author, price);
                    } else if (type.equalsIgnoreCase("Non-Fiction")) {
                        newBook = new NonFictionBook(title, author, price);
                    } else {
                        System.out.println("Invalid book type.");
                        continue;
                    }

                    bookstore.addBook(newBook);
                    break;
                case 2:
                    bookstore.viewCatalog();
                    break;
                case 3:
                    System.out.println("\nManage Inventory:");
                    System.out.println("1. Update inventory");
                    System.out.println("2. Delete book");
                    System.out.println("3. Back to main menu");
                    System.out.print("Enter your choice: ");
                    int inventoryChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (inventoryChoice) {
                        case 1:
                            System.out.print("Enter book title to update inventory: ");
                            String updateTitle = scanner.nextLine();
                            bookstore.addBook(new FictionBook(updateTitle, "", 0));
                            break;
                        case 2:
                            System.out.print("Enter book title to delete: ");
                            String deleteTitle = scanner.nextLine();
                            bookstore.deleteBook(deleteTitle);
                            break;
                        case 3:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;
                case 4:
                    System.out.print("Enter book name to search: ");
                    String searchName = scanner.nextLine();
                    bookstore.searchByName(searchName);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");

            }
        }
    }
}
