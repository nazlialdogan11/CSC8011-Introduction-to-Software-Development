package csc8011;

// Created a class named book with the fields book ID, title, year published and value.
public class Book {

    private String bookID;
    private String title;
    private int yearPublished;
    private double value;

    //Constructor to create the book object having bookID, title, yearPublished and value.
    public Book(String bookID, String title, int yearPublished, double value) {
        this.bookID = bookID;
        this.title = title;
        this.yearPublished = yearPublished;
        this.value = value;
    }

    //Default constructor for an empty Book object with bookID, title, yearPublished and value.
    public Book(){
        this.bookID = "";
        this.title = "";
        this.yearPublished = 0;
        this.value = 0;
    }

    //Getter methods to retrieve the required information(bookID, title, yearPublished and value) about the book object.
    public String getBookID() {
        return bookID;
    }
    public String getTitle() {
        return title;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public double getValue() {
        return value;
    }

    //Setter methods to update the book information if needed.
    public void setBookID(String bookID) {
        this.bookID = bookID;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public void setValue(int value) {
        this.value = value;
    }

}
