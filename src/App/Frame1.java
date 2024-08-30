package App;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.BorderLayout;

public class Frame1 {

    private JFrame frame;
    private JTextField txtLibraryManagementSystem;
    private JTextField InsertBookId;
    private JTextField InsertBookName;
    private JTextField InsertBookAuthor;
    private JTextField InsertBookPages;
    private JComboBox<String> categoryComboBox;
    private BookList bookList;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Frame1 window = new Frame1();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Frame1() {
        initialize();
        bookList = new BookList();  // Initialize the book list
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(SystemColor.window);
        frame.setBounds(100, 100, 882, 468);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel_3 = new JPanel();
        panel_3.setForeground(SystemColor.desktop);
        panel_3.setBackground(SystemColor.controlShadow);
        panel_3.setBounds(0, 0, 882, 62);
        frame.getContentPane().add(panel_3);
        panel_3.setLayout(null);

        JButton btnNewButton_1_1 = new JButton("Log Out");
        btnNewButton_1_1.setBounds(786, 11, 61, 19);
        panel_3.add(btnNewButton_1_1);
        btnNewButton_1_1.setForeground(new Color(178, 34, 34));
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 8));

        txtLibraryManagementSystem = new JTextField();
        txtLibraryManagementSystem.setForeground(SystemColor.window);
        txtLibraryManagementSystem.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        txtLibraryManagementSystem.setBackground(SystemColor.desktop);
        txtLibraryManagementSystem.setEnabled(false);
        txtLibraryManagementSystem.setEditable(false);
        txtLibraryManagementSystem.setText("     LIBRARY MANAGEMENT SYSTEM");
        txtLibraryManagementSystem.setBounds(0, 0, 872, 62);
        panel_3.add(txtLibraryManagementSystem);
        txtLibraryManagementSystem.setColumns(10);

        JPanel panel = new JPanel();
        panel.setBounds(286, 111, 507, 306);
        frame.getContentPane().add(panel);
        panel.setLayout(new BorderLayout(0, 0));

        JTextPane txtpnBookManagement = new JTextPane();
        txtpnBookManagement.setBackground(new Color(238, 232, 170));
        txtpnBookManagement.setFont(new Font("Tw Cen MT", Font.PLAIN, 18));
        txtpnBookManagement.setText("   Book Management");
        txtpnBookManagement.setEditable(false);
        panel.add(txtpnBookManagement, BorderLayout.NORTH);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(SystemColor.info);
        panel.add(panel_1, BorderLayout.CENTER);
        panel_1.setLayout(null);

        InsertBookId = new JTextField();
        InsertBookId.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
        InsertBookId.setForeground(SystemColor.windowText);
        InsertBookId.setBounds(110, 33, 95, 20);
        panel_1.add(InsertBookId);

        InsertBookName = new JTextField();
        InsertBookName.setForeground(SystemColor.windowText);
        InsertBookName.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
        InsertBookName.setBounds(110, 64, 95, 20);
        panel_1.add(InsertBookName);

        JTextPane txtpnBookId = new JTextPane();
        txtpnBookId.setBackground(SystemColor.info);
        txtpnBookId.setText("Book ISBN");
        txtpnBookId.setEnabled(false);
        txtpnBookId.setEditable(false);
        txtpnBookId.setForeground(SystemColor.desktop);
        txtpnBookId.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
        txtpnBookId.setBounds(10, 33, 74, 20);
        panel_1.add(txtpnBookId);

        JTextPane txtpnBookName = new JTextPane();
        txtpnBookName.setText("Book Name");
        txtpnBookName.setForeground(SystemColor.desktop);
        txtpnBookName.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
        txtpnBookName.setEnabled(false);
        txtpnBookName.setEditable(false);
        txtpnBookName.setBackground(SystemColor.info);
        txtpnBookName.setBounds(10, 64, 74, 20);
        panel_1.add(txtpnBookName);

        JTextPane txtpnBookCategory = new JTextPane();
        txtpnBookCategory.setText("Book Category");
        txtpnBookCategory.setForeground(SystemColor.desktop);
        txtpnBookCategory.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
        txtpnBookCategory.setEnabled(false);
        txtpnBookCategory.setEditable(false);
        txtpnBookCategory.setBackground(SystemColor.info);
        txtpnBookCategory.setBounds(10, 97, 90, 20);
        panel_1.add(txtpnBookCategory);

        String[] categories = {"Action", "Romance", "Suspense", "Documentary", "Others"};
        categoryComboBox = new JComboBox<>(categories);
        categoryComboBox.setBounds(110, 95, 95, 22);
        panel_1.add(categoryComboBox);

        JButton btnAddBook = new JButton("Add Book");
        btnAddBook.setBounds(362, 184, 90, 34);
        panel_1.add(btnAddBook);
        btnAddBook.setFont(new Font("Tahoma", Font.PLAIN, 11));
        btnAddBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addBook();
            }
        });

        JTextPane txtpnBookAuthor = new JTextPane();
        txtpnBookAuthor.setText("Book Author");
        txtpnBookAuthor.setForeground(SystemColor.desktop);
        txtpnBookAuthor.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
        txtpnBookAuthor.setEnabled(false);
        txtpnBookAuthor.setEditable(false);
        txtpnBookAuthor.setBackground(SystemColor.info);
        txtpnBookAuthor.setBounds(278, 33, 74, 20);
        panel_1.add(txtpnBookAuthor);

        InsertBookAuthor = new JTextField();
        InsertBookAuthor.setForeground(SystemColor.windowText);
        InsertBookAuthor.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
        InsertBookAuthor.setBounds(362, 33, 108, 20);
        panel_1.add(InsertBookAuthor);

        JTextPane txtpnBookPages = new JTextPane();
        txtpnBookPages.setText("Book Pages");
        txtpnBookPages.setForeground(SystemColor.desktop);
        txtpnBookPages.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
        txtpnBookPages.setEnabled(false);
        txtpnBookPages.setEditable(false);
        txtpnBookPages.setBackground(SystemColor.info);
        txtpnBookPages.setBounds(278, 64, 74, 20);
        panel_1.add(txtpnBookPages);

        InsertBookPages = new JTextField();
        InsertBookPages.setForeground(SystemColor.windowText);
        InsertBookPages.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
        InsertBookPages.setBounds(362, 64, 108, 20);
        panel_1.add(InsertBookPages);

        JPanel panel_2 = new JPanel();
        panel_2.setBackground(SystemColor.menu);
        panel_2.setBounds(0, 0, 184, 468);
        frame.getContentPane().add(panel_2);
        panel_2.setLayout(null);

        JButton btnInventory = new JButton("Inventory");
        btnInventory.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnInventory.setBounds(35, 67, 100, 31);
        panel_2.add(btnInventory);
        btnInventory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openInventory();
            }
        });

        JButton btnRemoveBook = new JButton("Remove");
        btnRemoveBook.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnRemoveBook.setBounds(35, 109, 100, 31);
        panel_2.add(btnRemoveBook);
        btnRemoveBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openRemoveBook();
            }
        });
    }

    private void addBook() {
        String isbn = InsertBookId.getText();
        String name = InsertBookName.getText();
        String author = InsertBookAuthor.getText();
        String pagesStr = InsertBookPages.getText();
        String category = (String) categoryComboBox.getSelectedItem();

        if (isbn.isEmpty() || name.isEmpty() || author.isEmpty() || pagesStr.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int pages = Integer.parseInt(pagesStr);
            Book book = new Book(isbn, name, author, pages, category);
            bookList.add(book);
            JOptionPane.showMessageDialog(frame, "Book added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame, "Invalid number of pages.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clearFields() {
        InsertBookId.setText("");
        InsertBookName.setText("");
        InsertBookAuthor.setText("");
        InsertBookPages.setText("");
        categoryComboBox.setSelectedIndex(0);
    }

    private void openInventory() {
        System.out.println("Opening Inventory Window");  // Debugging line
        searchWindow inventoryWindow = new searchWindow(bookList);
        inventoryWindow.setVisible(true);
    }

    private void openRemoveBook() {
        System.out.println("Opening Remove Book Window");  // Debugging line
        removeBook removeBookWindow = new removeBook(bookList);
        removeBookWindow.setVisible(true);
    }
}
