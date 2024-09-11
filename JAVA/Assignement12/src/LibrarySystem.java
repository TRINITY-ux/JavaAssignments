// Book class
class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }
}

// Library class
class Library {
    String libraryName;
    Book[] books;
    int bookCount;

    // Constructor to initialize library attributes
    public Library(String libraryName, int maxBooks) {
        this.libraryName = libraryName;
        this.books = new Book[maxBooks];
        this.bookCount = 0;
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Method to remove a book from the library by ISBN
    public void removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isbn.equals(isbn)) {
                // Shift books to fill the gap
                for (int j = i; j < bookCount - 1; j++) {
                    books[j] = books[j + 1];
                }
                bookCount--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found in the library.");
    }

    // Method to display all books in the library
    public void displayAllBooks() {
        if (bookCount == 0) {
            System.out.println("No books in the library.");
        } else {
            for (int i = 0; i < bookCount; i++) {
                books[i].displayBookDetails();
                System.out.println();
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        // Create a library with a maximum of 10 books
        Library l = new Library("My Library", 10);

        while (true) {
            System.out.println("Library System Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. Display all books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(System.console().readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = System.console().readLine();
                    System.out.print("Enter book author: ");
                    String author = System.console().readLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = System.console().readLine();

                    Book b = new Book(title, author, isbn);
                    l.addBook(b);
                    break;

                case 2:
                    System.out.print("Enter ISBN of the book to remove: ");
                    String isbnToRemove = System.console().readLine();
                    l.removeBook(isbnToRemove);
                    break;

                case 3:
                    System.out.println("Books in the library:");
                    l.displayAllBooks();
                    break;

                case 4:
                    System.out.println("Exiting the library system.");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}