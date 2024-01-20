package edu.asu.store.bookstore;
public class NonFictionBook extends Book{
      public NonFictionBook(String title, String author, double price) {
        super(title, author, price);
    }

      @Override
    public String getType() {
        return "Non-Fiction";
    }
    
}
