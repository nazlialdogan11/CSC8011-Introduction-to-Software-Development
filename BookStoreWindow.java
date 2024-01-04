package csc8011;

import java.util.ArrayList;

//Declaring the class BookStoreWindow with the two fields bookStoreName and books.
public class BookStoreWindow {
    private String bookStoreName;
    private ArrayList<Book> books;

    //Constructor to create the object BookStoreWindow with an indicated store name.
    public BookStoreWindow(String bookStoreName) {
        this.bookStoreName = bookStoreName;
    }
    //Getter method for retrieving the list of books available in the store.
    public ArrayList<Book> getBooks() {
        return books;
    }

    //Setter method for updating the list of books available in the store.
    public void setBooks (ArrayList<Book> NewBooks) {
        books = NewBooks;
    }

    //Getter method for retrieving the name of the bookstore.
    public String getBookStoreName() {
        return bookStoreName;
    }

    //Setter method for updating the name of the bookstore.
    public void setBookStoreName (String bookStoreName) {
        this.bookStoreName = bookStoreName;
    }

    //Method for finding and returning the highest value book available in the bookstore.
    public Book getHighestPriceBook() {
        Book highestValueBook = new Book();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getValue() > highestValueBook.getValue()) {
                highestValueBook = books.get(i);
            }
        }
        return  highestValueBook;
    }

    //Method for finding and returning the oldest book available in the bookstore.
    public Book getOldestBook() {
        Book OldestBook = new Book();
        OldestBook.setYearPublished(Integer.MAX_VALUE);
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getYearPublished() < OldestBook.getYearPublished()) {
                    OldestBook = books.get(i);
            }
        }
        return OldestBook;
    }

    //Method for calculating and returning the average value of the books in the bookstore.
    public double getAverageValue() {
        double averageValue;
        double sum = 0;
        for (int i = 0; i < books.size(); i++) {
            sum += books.get(i).getValue();
        }
        averageValue = sum / books.size();
        return averageValue;
    }

}
