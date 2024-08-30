package App;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class searchWindow extends JFrame {
    private JTextField searchField;
    private JTextPane resultPane;
    private BookList bookList;

    public searchWindow(BookList bookList) {
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


        resultPane = new JTextPane();
        resultPane.setBounds(39, 144, 390, 167);
        yellowPanel.add(resultPane);

        JButton searchButton = new JButton("Search");
        searchButton.setBounds(200, 85, 80, 20);
        searchButton.addActionListener(e -> searchBook());
        yellowPanel.add(searchButton);
    }

    private void searchBook() {
        String query = searchField.getText();
        List<Book> results = bookList.search(query);
        StringBuilder resultText = new StringBuilder();

        if (!results.isEmpty()) {
            for (Book book : results) {
                resultText.append("ISBN: ").append(book.getIsbn()).append("\n")
                          .append("Name: ").append(book.getName()).append("\n")
                          .append("Author: ").append(book.getAuthor()).append("\n")
                          .append("Category: ").append(book.getCategory()).append("\n\n");
            }
            resultPane.setText(resultText.toString());
        } else {
            resultPane.setText("No books found with the given search term.");
        }
    }
}
