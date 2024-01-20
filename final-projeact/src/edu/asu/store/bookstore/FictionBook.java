
package edu.asu.store.bookstore;


public class FictionBook extends Book{
     public FictionBook(String title, String author, double price) {
        super(title, author, price);
    }

     @Override
    public String getType() {
        return "Fiction";
    }
    
}
