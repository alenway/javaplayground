import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Library {
    private List<Book> catalog;
    private List<BorrowRecord> borrowRecords;

    public Library() {
        this.catalog = new ArrayList<>();
        this.borrowRecords = new ArrayList<>();
    }

    // Add a book to the catalog
    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Book Added: " + book.getTitle());
    }

    // Update an existing book's details
    public void updateBook(String ISBN, String newTitle, String newAuthor, String newGenre, boolean newAvailable) {
        for (Book book : catalog) {
            if (book.getISBN().equals(ISBN)) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setGenre(newGenre);
                book.setAvailable(newAvailable);
                System.out.println("Book Updated: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Delete a book from the catalog
    public void deleteBook(String ISBN) {
        for (Book book : catalog) {
            if (book.getISBN().equals(ISBN)) {
                catalog.remove(book);
                System.out.println("Book deleted: " + book.getTitle());
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Search for books in the catalog
    public List<Book> searchBooks(String query) {
        List<Book> result = new ArrayList<>();
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)
                    || book.getGenre().equalsIgnoreCase(query)) {
                result.add(book);
            }
        }
        return result;
    }

    // Display all books in the catalog
    public void displayCatalog() {
        for (Book book : catalog) {
            System.out.println(book);
        }
    }

    // Borrow a book
    public void borrowBook(String ISBN, String userName) {
        for (Book book : catalog) {
            if (book.getISBN().equals(ISBN)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    Date borrowDate = new Date();
                    Calendar cal = Calendar.getInstance();
                    cal.setTime(borrowDate);
                    cal.add(Calendar.DAY_OF_MONTH, 14); // 14 days borrow period
                    Date dueDate = cal.getTime();
                    borrowRecords.add(new BorrowRecord(book, userName, borrowDate, dueDate));
                    System.out.println("Book borrowed: " + book.getTitle());
                } else {
                    System.out.println("Book is not available.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Return a book
    public void returnBook(String ISBN, String userName) {
        for (BorrowRecord record : borrowRecords) {
            if (record.getBook().getISBN().equals(ISBN) && record.getUserName().equals(userName)) {
                record.getBook().setAvailable(true);
                borrowRecords.remove(record);
                System.out.println("Book returned: " + record.getBook().getTitle());
                return;
            }
        }
        System.out.println("No borrow record found for this book and user.");
    }

    // Check for overdue books
    public void checkOverdueBooks() {
        Date currentDate = new Date();
        for (BorrowRecord record : borrowRecords) {
            if (currentDate.after(record.getDueDate())) {
                System.out.println(
                        "Overdue Book: " + record.getBook().getTitle() + " borrowed by " + record.getUserName());
            }
        }
    }
}

class Book {
    private String title;
    private String author;
    private String ISBN;
    private String genre;
    private boolean available;

    public Book(String title, String author, String ISBN, String genre, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genre = genre;
        this.available = available;
    }

    public Book(String string, int i) {
        // TODO Auto-generated constructor stub
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", genre='" + genre + '\'' +
                ", available=" + available +
                '}';
    }
}

class BorrowRecord {
    private Book book;
    private String userName;
    private Date borrowDate;
    private Date dueDate;

    public BorrowRecord(Book book, String userName, Date borrowDate, Date dueDate) {
        this.book = book;
        this.userName = userName;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public Book getBook() {
        return book;
    }

    public String getUserName() {
        return userName;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getDueDate() {
        return dueDate;
    }
}

class AuthenticationSystem {
    private List<User> users;

    public AuthenticationSystem() {
        this.users = new ArrayList<>();
    }

    public void registerUser(String userName, String password, boolean isAdmin) {
        // Check if the username already exists
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                System.out.println("User already exists. Please choose a different one.");
                return;
            }
        }
        // Add new user to the list outside the loop
        users.add(new User(userName, password, isAdmin));
        System.out.println("Registration Successful.");
    }

    public User loginUser(String userName, String password) {
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return user;
            }
        }
        System.out.println("Invalid username or password.");
        return null;
    }
}

class User {
    private String userName;
    private String password;
    private boolean isAdmin;

    public User(String userName, String password, boolean isAdmin) {
        this.userName = userName;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}

public class Main {
    public static void main(String[] args) {
        AuthenticationSystem authSystem = new AuthenticationSystem();
        Library library = new Library();

        // Register Users
        authSystem.registerUser("admin", "admin123", true);
        authSystem.registerUser("alice", "password123", false);

        // Login user
        User currentUser = authSystem.loginUser("admin", "admin123");

        if (currentUser != null) {
            // Add books to the catalog
            library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", "Fiction", true));
            library.addBook(new Book("1984", "George Orwell", "987654321", "Dystopian", false));

            // Display the catalog
            System.out.println("Library Catalog:");
            library.displayCatalog();

            // Update a book
            library.updateBook("123456789", "The Great Gatsby", "F. Scott Fitzgerald", "Classic", true);

            // Delete a book
            library.deleteBook("987654321");

            // Search for a book
            System.out.println("Search Results for 'Gatsby':");
            List<Book> results = library.searchBooks("Gatsby");
            for (Book book : results) {
                System.out.println(book);
            }

            // Borrow a book
            library.borrowBook("123456789", "alice");

            // Return a book
            library.returnBook("123456789", "alice");

            // Check for overdue books
            library.checkOverdueBooks();

            // Display the catalog again
            System.out.println("Updated Library Catalog:");
            library.displayCatalog();
        }
    }
}
