package App;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class removeBook extends JFrame {
    private JTextField searchField;
    private JTextPane bookInfoPane;
    private BookList bookList;

    public removeBook(BookList bookList) {
        this.bookList = bookList;
        initialize();
    }

    private void initialize() {
        setBounds(100, 100, 476, 402);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setLayout(null);
        yellowPanel.setBackground(SystemColor.info);
        yellowPanel.setBounds(0, 0, 467, 372);
        getContentPane().add(yellowPanel);

        searchField = new JTextField();
        searchField.setBounds(69, 85, 124, 20);
        yellowPanel.add(searchField);

        JTextPane txtpnSearch = new JTextPane();
        txtpnSearch.setText("Search:");
        txtpnSearch.setBounds(10, 85, 130, 20);
        yellowPanel.add(txtpnSearch);

        JTextField titleField = new JTextField();
        titleField.setText("   Library Management System");
        titleField.setBounds(0, 0, 467, 62);
        yellowPanel.add(titleField);
        titleField.setEditable(false);


        bookInfoPane = new JTextPane();
        bookInfoPane.setBounds(39, 144, 390, 167);
        yellowPanel.add(bookInfoPane);

        JButton removeButton = new JButton("Remove Book");
        removeButton.setBounds(306, 322, 123, 23);
        removeButton.addActionListener(e -> removeBook());
        yellowPanel.add(removeButton);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(200, 85, 80, 20);
        searchButton.addActionListener(e -> searchBook());
        yellowPanel.add(searchButton);
    }

    private void searchBook() {
        String query = searchField.getText();
        List<Book> results = bookList.search(query);
        if (!results.isEmpty()) {
            Book book = results.get(0);
            bookInfoPane.setText("ISBN: " + book.getIsbn() + "\n" +
                                 "Name: " + book.getName() + "\n" +
                                 "Author: " + book.getAuthor() + "\n" +
                                 "Category: " + book.getCategory());
        } else {
            bookInfoPane.setText("No book found with the given search term.");
        }
    }

    private void removeBook() {
        String isbn = searchField.getText();
        if (bookList.remove(isbn)) {
            JOptionPane.showMessageDialog(this, "Book removed successfully!");
            bookInfoPane.setText("");
            searchField.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Book not found!");
        }
    }
}
