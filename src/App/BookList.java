package App;

import java.util.ArrayList;
import java.util.List;

public class BookList {
    private List<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public void add(Book book) {
        books.add(book);
    }

    public boolean remove(String isbn) {
        return books.removeIf(book -> book.getIsbn().equals(isbn));
    }

    public List<Book> search(String query) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(query) ||
                book.getAuthor().equalsIgnoreCase(query) ||
                book.getIsbn().equalsIgnoreCase(query)) {
                results.add(book);
            }
        }
        return results;
    }

    public List<Book> getBooks() {
        return books;
    }
}
