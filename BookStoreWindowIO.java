package csc8011;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//BookStoreWindowIO class declaration including methods inside for user interaction.
public class BookStoreWindowIO {

    private static BookStoreWindow bookStoreWindow;

    //Setter method linking this class with BookStoreWindow.
    public void setBookStoreWindow (BookStoreWindow bookStoreWindow) {
        this.bookStoreWindow = bookStoreWindow;
    }

    //Getter method retrieving the linked BookStoreWindow.
    public BookStoreWindow getBookStoreWindow () {
        return bookStoreWindow;
    }

    //Method reading book data from the book.csv file and creating a list of the Book objects.
    private static ArrayList<Book> ReadCSVFileAndCreateBooks (String path) {
        ArrayList<Book> books = new ArrayList<Book>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] bookProperties = line.split(",");
                String bookID = bookProperties[0];
                String bookTitle =bookProperties[1];
                int yearPublished = Integer.parseInt(bookProperties[2]);
                double bookValue = Double.parseDouble(bookProperties[3]);

                Book book = new Book(bookID, bookTitle, yearPublished, bookValue);
                books.add(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return books;
    }

    //Method for printing the book details from our book list.
    private static void PrintBooks (ArrayList<Book> BookList) {
        for (int i = 0; i < BookList.size(); i++) {
            System.out.println("Book ID: " + BookList.get(i).getBookID() + ", " + "Title: " +
                    BookList.get(i).getTitle() + ", " + "Year Published: " + BookList.get(i).getYearPublished() + ", " +
                    "Value: £" + BookList.get(i).getValue());
        }
    }

    //Method for changing the bookstore name.
    private static void ChangeBookStoreName(){
        System.out.println("Current Bookstore Name: " + bookStoreWindow.getBookStoreName());
        System.out.println("Please enter new bookstore name: ");
        Scanner scan = new Scanner(System.in);
        String newBookStoreName = scan.nextLine();
        bookStoreWindow.setBookStoreName(newBookStoreName);
        System.out.println("Bookstore name changed successfully.");
    }

    //Method for printing out the statistics on the books.
    private static void PrintBookStatistics(){
        System.out.println("The statistics on highest value, oldest book, and average value of the books: ");
        Book highestPriceBook =  bookStoreWindow.getHighestPriceBook();
        Book oldestBook =bookStoreWindow.getOldestBook();
        double averageBookValue = bookStoreWindow.getAverageValue();
        System.out.println("Highest value book: " + highestPriceBook.getTitle() +
                " (published " + highestPriceBook.getYearPublished()+ "), £"
                + highestPriceBook.getValue());
        System.out.println("Oldest book: " + oldestBook.getTitle() + " (published "
                + oldestBook.getYearPublished()+ ")");
        System.out.print("Average value of books: £");
        System.out.printf("%.2f", averageBookValue);
        System.out.println();
    }

    //Method containing the user menu for the users to interact with the bookstore management system.
    private static void HandleUserMenu() {
        int selection = 0;
        Scanner scan = new Scanner(System.in);
        while(selection != 5){
            System.out.println("------------- Bookstore Window Manager ------------- ");
            System.out.println("1 )  Change name of the book store.");
            System.out.println("2 )  Read data from .csv file.");
            System.out.println("3 )  Print books.");
            System.out.println("4 )  Print book statistics.");
            System.out.println("5 )  Quit program.");
            selection = Integer.parseInt(scan.nextLine());
            switch (selection){
                case 1:
                    ChangeBookStoreName();
                    break;
                case 2:
                    ArrayList<Book> books = ReadCSVFileAndCreateBooks("books.csv");
                    bookStoreWindow.setBooks(books);
                    break;
                case 3:
                    PrintBooks(bookStoreWindow.getBooks());
                    break;
                case 4:
                    PrintBookStatistics();
                    break;
                case 5:
                    System.out.println("Quitting program.");
                    break;
                default:
                    System.out.println("This is not a valid option. Please try again.");
                    break;
            }
        }
    }

    //Main method, entry point of the program.
    public static void main(String[] args) throws IOException {
        bookStoreWindow = new BookStoreWindow("Blackwell's");
        HandleUserMenu();
    }

}
