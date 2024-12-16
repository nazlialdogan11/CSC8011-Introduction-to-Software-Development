# 📚 Bookstore Window Manager 

*Bookstore Window Manager project was completed as a coursework for the CSC8011 module taught for the MSc Computer Science programme within the School of Computing at Newcastle University for the 2023/2024 Academic Year.*

This project aims to provide a tracking system for the books displayed on a local bookstore window.

>___Feedback:___
> "A distinction mark, well done."
> -*Dr DJ Nesbitt, Module Leader*

## ⚙️ How to Install 

Clone the project to your computer.

```
> [git clone https://github.com/erendgrmnc/BezierCurveCase.git](https://github.com/nazlialdogan11/CSC8011-Introduction-to-Software-Development.git )
```

Open the .java files.

# ℹ About the Bookstore Window Manager

The Bookstore Window Manager aims to assist the employees of a local bookstore to keep track of the books displayed on the bookstore window. It ensures to display one copy of each book at the same time, all the while keeping track of the book information such as the unique ID, title, year the book was published and the monetary value of the book (in Pounds sterling).

# 🔖 Achievements

***The system successfully:***
- Defines a Java class "Book" with appropriate fields, methods and constructor to store and retrieve information about the book ID, title, year published and value.
- Defines a Java class "BookStoreWindow" to represent the book store's window, with appropriate fields, methods and constructor to store and retrieve the name of the book store and a list of Book items.
- Uses an appropriate Collection class to represent the list of books.
- Includes methods to find and return the object representing the book with the highest value, the object representing the oldest book displayed in the window and the average value of all books.
- Defines a Java class "BookStoreWindowIO" with a main method to present the user with a menu of options:
> - Enter the name of the book store.
> - Read in information on the books from a .csv file in the current directory called books.csv. 
> - Print a summary of the book store name followed by a list of all books, their value and the year published.
> - Print statistics on books, showing the full details of the book with the highest value, oldest book displayed in the window, and average value of books displayed in the window of the book store.
> - Take user input from the console to choose one of the menu options.
> - After executing one of the features, return the user to the menu to choose another option.

***The learning outcomes achieved upon the completion of this project were summarised below.***
- Defined classes, fields, constructors, and methods in Java.
- Used appropriate types, including collections.
- Implemented basic algorithms using collections.
- Wrote a main method including console and file input/output.
- Provided well encapsulated classes as well as a proper amount of comments.

# 📄 Program Output

Program output demonstrates the system capabilities.

After executing the code, the system displays a menu for user interaction (Figure 1).

# ❇️ Future Improvements

***The following remarks were made by the instructor for future improvements.***
- Creating blank Book instances to be replaced by initially getting the first book in the ArrayList as a starting point Methods for getting the highest priced book and oldest book for optimisation.
- Placing the code that prints out the menu into a separate auxiliary method to simplify the HandleUserMenu() method.
- Using more try/catch blocks to deal with invalid user input (i.e. if user does not enter a number for the menu).

  # References

- *[Click for detailed information on the CSC8011 module.]([https://stackoverflow.com](https://www.ncl.ac.uk/module-catalogue/module.php?code=CSC8011 )*
  





