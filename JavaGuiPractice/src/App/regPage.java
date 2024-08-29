package App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class regPage {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField inputEmail;
	private JTextField txtEmail;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField inputUsername;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regPage window = new regPage();
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
	public regPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 332, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setText("   Library Management System");
		textField_1.setForeground(SystemColor.window);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(SystemColor.desktop);
		textField_1.setBounds(0, 0, 324, 62);
		frame.getContentPane().add(textField_1);
		
		JPanel yelowpanel = new JPanel();
		yelowpanel.setLayout(null);
		yelowpanel.setBackground(SystemColor.info);
		yelowpanel.setBounds(10, 73, 298, 330);
		frame.getContentPane().add(yelowpanel);
		
		inputUsername = new JTextField();
		inputUsername.setColumns(10);
		inputUsername.setBounds(100, 132, 150, 20);
		yelowpanel.add(inputUsername);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 179, 150, 20);
		yelowpanel.add(passwordField);
		
		inputEmail = new JTextField();
		inputEmail.setColumns(10);
		inputEmail.setBounds(100, 85, 150, 20);
		yelowpanel.add(inputEmail);
		
		txtEmail = new JTextField();
		txtEmail.setText("E-Mail");
		txtEmail.setForeground(SystemColor.desktop);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmail.setEnabled(false);
		txtEmail.setEditable(false);
		txtEmail.setColumns(10);
		txtEmail.setBackground(SystemColor.info);
		txtEmail.setBounds(26, 77, 239, 36);
		yelowpanel.add(txtEmail);
		
		textField_2 = new JTextField();
		textField_2.setText("Password");
		textField_2.setForeground(SystemColor.desktop);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setEnabled(false);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBackground(SystemColor.info);
		textField_2.setBounds(26, 171, 239, 36);
		yelowpanel.add(textField_2);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(100, 250, 89, 23);
		yelowpanel.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setText("Username");
		textField_3.setForeground(SystemColor.desktop);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setEnabled(false);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(SystemColor.info);
		textField_3.setBounds(26, 124, 239, 36);
		yelowpanel.add(textField_3);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(0, 0, 324, 413);
		frame.getContentPane().add(panel);
	}

}
