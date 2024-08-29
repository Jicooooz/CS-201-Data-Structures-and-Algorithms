import java.util.ArrayList;

class Library {
    private ArrayList<Book> books;

    public Library(int capacity) {
        books = new ArrayList<>(capacity);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(int index) {
        if (index >= 0 && index < books.size()) {
            books.remove(index);
        } else {
            throw new IndexOutOfBoundsException("No book found at index " + index);
        }
    }

    public Book searchBook(int index) {
        if (index >= 0 && index < books.size()) {
            return books.get(index);
        }
        return null;
    }

    public int getTotalBooks() {
        return books.size();
    }
}