import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<>();
    }

    // Add a book to a catalog
    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Bood Added" + book.getTitle());
    }

    // updating an existing book details
    public void updateBook(String ISBN, String newTitle, String newAuthor, String newGenere, boolean newAvailable) {
        for (Book book : catalog) {
            if (book.getISBN().equals(ISBN)) {
                book.setTitle(newTitle);
                book.setAuthor(newAuthor);
                book.setGenere(newGenere);
                book.setGenere(newGenere);
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

    public List<Book> searchBooks(String query) {
        List<Book> result = new ArrayList<>();
        for (Book book : catalog) {
            if (book.getTitle().equalsIgnoreCase(query) || book.getAuthor().equalsIgnoreCase(query)
                    || book.getGenere().equalsIgnoreCase(query)) {
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
}

class Book {
    private String title;
    private String author;
    private String ISBN;
    private String genere;
    private boolean available;

    public Book(String title, String author, String ISBN, String genere, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.genere = genere;
        this.available = available;
    }

    // Getter and Setter
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

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

class AuthenticationSystem {
    private List<User> users;

    public AuthenticationSystem() {
        this.users = new ArrayList<>();
    }

    public void registerUsers(String userName, String password) {
        // Check if the username already exists
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                System.out.println("User already exists. Please choose a different one.");
                return;
            }
        }
        // Add new user to the list outside the loop
        users.add(new User(userName, password));
        System.out.println("Registration Successful.");
    }

    public boolean loginUser(String userName, String password) {
        for (User user : users) {
            if (user.getUserName().equals(userName) && user.getPassword().equals(password)) {
                System.out.println("Login successful.");
                return true;
            }
        }
        System.out.println("Invalid username or password.");
        return false;
    }
}

class User {
    private String userName;
    private String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

public class Main {
    public static void main(String[] args) {
        /*
         * AuthenticationSystem authSystem = new AuthenticationSystem();
         * // Register User
         * authSystem.registerUsers("alice", "password123");
         * // Login user
         * authSystem.loginUser("alice", "password123" );
         */
        Library library = new Library();

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

        // Display the catalog again
        System.out.println("Updated Library Catalog:");
        library.displayCatalog();
    }
}
