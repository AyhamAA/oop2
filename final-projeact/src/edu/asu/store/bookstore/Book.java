package edu.asu.store.bookstore;
abstract class Book {
     protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public abstract String getType();

    public String toString() {
        return getType() + ": " + title + " by " + author + " - $" + price;
    }
}
