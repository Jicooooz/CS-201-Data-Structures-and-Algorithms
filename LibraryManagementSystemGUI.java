import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryManagementSystemGUI {
    private static Library library = new Library(10); // Capacity of 10 books
    private static JTextArea textArea;

    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Library Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.LIGHT_GRAY); // Background color

        // Create a text area for displaying books
        textArea = new JTextArea();
        textArea.setEditable(false);
        textArea.setFont(new Font("Arial", Font.PLAIN, 14)); // Font style
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Create a panel for buttons and search bar
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Add buttons
        JButton addButton = new JButton("Add Book");
        JButton removeButton = new JButton("Remove Book");
        JButton searchButton = new JButton("Search Book");
        JButton displayButton = new JButton("Display All Books");
        JButton exitButton = new JButton("Exit");

        JTextField searchField = new JTextField(20);
        JButton filterButton = new JButton("Filter");

        // Add action listeners to buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addBookDialog(frame);
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeBookDialog(frame);
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                searchBookDialog(frame);
            }
        });

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayBooks();
            }
        });

        filterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                filterBooks(searchField.getText());
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add components to the panel
        buttonPanel.add(addButton);
        buttonPanel.add(removeButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(displayButton);
        buttonPanel.add(searchField);
        buttonPanel.add(filterButton);
        buttonPanel.add(exitButton);

        // Add the button panel to the frame
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }

    private static void addBookDialog(JFrame frame) {
        JTextField titleField = new JTextField(20);
        JTextField authorField = new JTextField(20);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(new JLabel("Book Title:"));
        panel.add(titleField);
        panel.add(new JLabel("Book Author:"));
        panel.add(authorField);

        int result = JOptionPane.showConfirmDialog(frame, panel, "Add Book", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String title = titleField.getText();
            String author = authorField.getText();
            if (!title.isEmpty() && !author.isEmpty()) {
                library.addBook(new Book(title, author));
                showMessageDialog(frame, "Added: " + title + " by " + author);
            } else {
                showMessageDialog(frame, "Title and Author cannot be empty.");
            }
        }
    }

    private static void removeBookDialog(JFrame frame) {
        String indexStr = JOptionPane.showInputDialog(frame, "Enter index of book to remove:");
        try {
            int index = Integer.parseInt(indexStr);
            library.removeBook(index);
            showMessageDialog(frame, "Removed book at index: " + index);
        } catch (NumberFormatException | IndexOutOfBoundsException ex) {
            showMessageDialog(frame, "Invalid index. Please try again.");
        }
    }

    private static void searchBookDialog(JFrame frame) {
        String indexStr = JOptionPane.showInputDialog(frame, "Enter index of book to search:");
        try {
            int index = Integer.parseInt(indexStr);
            Book foundBook = library.searchBook(index);
            if (foundBook != null) {
                showMessageDialog(frame, "Found book: " + foundBook);
            } else {
                showMessageDialog(frame, "No book found at index: " + index);
            }
        } catch (NumberFormatException ex) {
            showMessageDialog(frame, "Invalid index. Please try again.");
        }
    }

    private static void filterBooks(String query) {
        StringBuilder results = new StringBuilder("Filtered Books:\n");
        boolean found = false;
        for (int i = 0; i < library.getTotalBooks(); i++) {
            Book book = library.searchBook(i);
            if (book != null && (book.toString().toLowerCase().contains(query.toLowerCase()))) {
                results.append(i).append(": ").append(book).append("\n");
                found = true;
            }
        }
        if (!found) {
            results.append("No matching books found.");
        }
        showMessageDialog(null, results.toString());
    }

    private static void showMessageDialog(JFrame frame, String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    private static void updateTextArea(String message) {
        textArea.append(message + "\n");
    }

    private static void displayBooks() {
        textArea.setText(""); // Clear the text area
        for (int i = 0; i < library.getTotalBooks(); i++) {
            Book book = library.searchBook(i);
            textArea.append(i + ": " + book + "\n");
        }
    }
}