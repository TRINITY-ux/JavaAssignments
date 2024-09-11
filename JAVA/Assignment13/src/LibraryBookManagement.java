// Book.java
import java.util.ArrayList;
 class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean availabilityStatus;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availabilityStatus = true; // initially, the book is available
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean status) {
        this.availabilityStatus = status;
    }
}

// Library.java


class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void checkoutBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book.isAvailable()) {
                    book.setAvailabilityStatus(false);
                    System.out.println("Book checked out successfully.");
                } else {
                    System.out.println("Error: Book is already checked out.");
                }
                return;
            }
        }
        System.out.println("Error: Book not found.");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (!book.isAvailable()) {
                    book.setAvailabilityStatus(true);
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Error: Book is already available.");
                }
                return;
            }
        }
        System.out.println("Error: Book not found.");
    }

    public void displayBookStatus(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                System.out.println("Book Title: " + book.getTitle());
                System.out.println("Book Author: " + book.getAuthor());
                System.out.println("Book ISBN: " + book.getIsbn());
                System.out.println("Availability Status: " + (book.isAvailable() ? "Available" : "Not Available"));
                return;
            }
        }
        System.out.println("Error: Book not found.");
    }
}

// Main.java
public class LibraryBookManagement{
    public static void main(String[] args) {
        Library library = new Library();

        // Test Case 1: Add a book and then check it out. Verify that the availabilityStatus changes correctly.
        Book book1 = new Book("Book1", "Author1", "ISBN1");
        library.addBook(book1);
        library.checkoutBook("ISBN1"); // availabilityStatus should be false
        library.displayBookStatus("ISBN1"); // should display "Not Available"

        // Test Case 2: Return a checked-out book and verify its status.
        library.returnBook("ISBN1"); // availabilityStatus should be true
        library.displayBookStatus("ISBN1"); // should display "Available"

        // Test Case 3: Attempt to check out a book that's already checked out and handle the error.
        library.checkoutBook("ISBN1"); // should print "Error: Book is already checked out."
    }
}