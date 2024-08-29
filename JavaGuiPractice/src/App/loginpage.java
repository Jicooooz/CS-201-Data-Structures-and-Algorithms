package App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class loginpage {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtUsername;
	private JTextField inputUser;
	private JTextField txtPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginpage window = new loginpage();
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
	public loginpage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setBounds(100, 100, 333, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("   Library Management System");
		textField.setForeground(SystemColor.window);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(SystemColor.desktop);
		textField.setBounds(0, 0, 324, 62);
		frame.getContentPane().add(textField);
		
		JPanel yelowpanel = new JPanel();
		yelowpanel.setBackground(SystemColor.info);
		yelowpanel.setBounds(10, 73, 298, 313);
		frame.getContentPane().add(yelowpanel);
		yelowpanel.setLayout(null);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(100, 130, 150, 20);
		yelowpanel.add(passwordField);
		
		inputUser = new JTextField();
		inputUser.setBounds(100, 85, 150, 20);
		yelowpanel.add(inputUser);
		inputUser.setColumns(10);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUsername.setBackground(SystemColor.info);
		txtUsername.setText("Username");
		txtUsername.setEditable(false);
		txtUsername.setEnabled(false);
		txtUsername.setForeground(SystemColor.desktop);
		txtUsername.setBounds(26, 77, 239, 36);
		yelowpanel.add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setForeground(SystemColor.desktop);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPassword.setEnabled(false);
		txtPassword.setEditable(false);
		txtPassword.setColumns(10);
		txtPassword.setBackground(SystemColor.info);
		txtPassword.setBounds(26, 122, 239, 36);
		yelowpanel.add(txtPassword);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.setBounds(100, 214, 89, 23);
		yelowpanel.add(btnNewButton);
	}
}
