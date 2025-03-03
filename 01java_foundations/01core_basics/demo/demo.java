import java.util.List;

class Book {
    String title;
    int year;

    public Book(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString() {
        return ("title of the book: " + title + "yearo of the book: " + year);
    }
}

public class demo {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("title", 1900),
                new Book("sldifj", 1800));
        System.out.println(books);
    }
}
