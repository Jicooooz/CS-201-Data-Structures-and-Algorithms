package App;

public class Book {
    private String isbn;
    private String name;
    private String author;
    private int pages;
    private String category;

    public Book(String isbn, String name, String author, int pages, String category) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.category = category;
    }

    // Getters
    public String getIsbn() { return isbn; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getPages() { return pages; }
    public String getCategory() { return category; }

    @Override
    public String toString() {
        return String.format("%-15s %-30s %-20s %-10d %-15s", isbn, name, author, pages, category);
    }
}