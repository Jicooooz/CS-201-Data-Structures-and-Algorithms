package App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;

public class Frame2RegPage {

	private JFrame frame;
	private JTextField regpageTitle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame2RegPage window = new Frame2RegPage();
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
	public Frame2RegPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(100, 100, 340, 418);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		regpageTitle = new JTextField();
		regpageTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		regpageTitle.setForeground(SystemColor.window);
		regpageTitle.setBackground(SystemColor.desktop);
		regpageTitle.setEditable(false);
		regpageTitle.setEnabled(false);
		regpageTitle.setText("   Library Management System");
		regpageTitle.setBounds(0, 0, 324, 62);
		frame.getContentPane().add(regpageTitle);
		regpageTitle.setColumns(10);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBounds(107, 160, 105, 43);
		frame.getContentPane().add(loginButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(107, 214, 105, 43);
		frame.getContentPane().add(btnRegister);
	}
}
