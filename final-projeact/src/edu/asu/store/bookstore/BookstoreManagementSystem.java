package edu.asu.store.bookstore;

import java.util.ArrayList;
import java.util.List;

public class BookstoreManagementSystem extends InventorySubject implements InventoryObserver {
     private List<Book> catalog = new ArrayList<>();
    private static final String FILE_NAME = "storage.txt";
    private FileManager fileManager;

    public BookstoreManagementSystem() {
        this.fileManager = FileManager.getInstance();
        addObserver(this);
        loadCatalogFromStorage();
    }

    private void loadCatalogFromStorage() {
        List<String> lines = fileManager.readFile(FILE_NAME);
        for (String line : lines) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                String type = parts[0];
                String title = parts[1];
                String author = parts[2];
                double price = Double.parseDouble(parts[3]);

                if (type.equals("Fiction")) {
                    catalog.add(new FictionBook(title, author, price));
                } else if (type.equals("Non-Fiction")) {
                    catalog.add(new NonFictionBook(title, author, price));
                }
            }
        }
    }

    private void updateStorage() {
        List<String> lines = new ArrayList<>();
        for (Book book : catalog) {
            lines.add(book.getType() + "," + book.title + "," + book.author + "," + book.price);
        }
        fileManager.writeFile(FILE_NAME, lines);
    }

    public void addBook(Book book) {
        catalog.add(book);
        updateStorage();
        notifyObservers();
    }

    public void viewCatalog() {
        for (Book book : catalog) {
            System.out.println(book);
        }
    }

    public void deleteBook(String title) {
        catalog.removeIf(book -> book.title.equals(title));
        updateStorage();
        notifyObservers();
    }

    public void searchByName(String name) {
        for (Book book : catalog) {
            if (book.title.contains(name)) {
                System.out.println(book);
            }
        }
    }

    public void update() {
        System.out.println("Inventory updated!");
    }
    
}
