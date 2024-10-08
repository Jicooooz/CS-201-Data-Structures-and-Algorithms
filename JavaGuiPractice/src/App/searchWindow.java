package App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JList;

public class searchWindow {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTextField txtBookName;
	private JTextField txtBookIsbn;
	private JTextField txtCategory;
	private JTextField txtBookAuthor;
	private JPanel panel_1;
	private JTextField textField_1;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					searchWindow window = new searchWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public searchWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 483, 411);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel yelowpanel = new JPanel();
		yelowpanel.setLayout(null);
		yelowpanel.setBackground(SystemColor.info);
		yelowpanel.setBounds(0, 0, 568, 372);
		frame.getContentPane().add(yelowpanel);
		
		textField = new JTextField();
		textField.setBounds(69, 85, 124, 20);
		yelowpanel.add(textField);
		textField.setColumns(10);
		
		JTextPane txtpnSearch = new JTextPane();
		txtpnSearch.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnSearch.setText("Search:");
		txtpnSearch.setBackground(SystemColor.info);
		txtpnSearch.setBounds(10, 85, 130, 20);
		yelowpanel.add(txtpnSearch);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.desktop);
		panel.setBounds(39, 116, 390, 30);
		yelowpanel.add(panel);
		
		table = new JTable();
		panel.add(table);
		
		txtBookName = new JTextField();
		txtBookName.setText("Book Name");
		panel.add(txtBookName);
		txtBookName.setColumns(10);
		
		txtBookIsbn = new JTextField();
		txtBookIsbn.setText("Book ISBN");
		txtBookIsbn.setColumns(10);
		panel.add(txtBookIsbn);
		
		txtBookAuthor = new JTextField();
		txtBookAuthor.setText("Book Author");
		txtBookAuthor.setColumns(10);
		panel.add(txtBookAuthor);
		
		txtCategory = new JTextField();
		txtCategory.setText("Category");
		txtCategory.setColumns(10);
		panel.add(txtCategory);
		
		panel_1 = new JPanel();
		panel_1.setBounds(39, 144, 390, 217);
		yelowpanel.add(panel_1);
		panel_1.setLayout(null);
		
		list = new JList();
		list.setBounds(24, 11, 1, 1);
		panel_1.add(list);
		
		textField_1 = new JTextField();
		textField_1.setText("   Library Management System");
		textField_1.setForeground(SystemColor.window);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.desktop);
		textField_1.setBounds(0, 0, 467, 62);
		yelowpanel.add(textField_1);
	}
}
