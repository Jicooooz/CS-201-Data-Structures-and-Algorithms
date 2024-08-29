package App;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.SystemColor;
import java.awt.BorderLayout;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Frame1 {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextField txtLibraryManagementSystem;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
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
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
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
		
		JTextPane InsertBookId = new JTextPane();
		InsertBookId.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		InsertBookId.setForeground(SystemColor.scrollbar);
		InsertBookId.setBounds(110, 33, 95, 20);
		panel_1.add(InsertBookId);
		
		JTextPane InsertBookName = new JTextPane();
		InsertBookName.setForeground(SystemColor.scrollbar);
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
		
		JMenuBar bookCategMenu = new JMenuBar();
		bookCategMenu.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		bookCategMenu.setBackground(SystemColor.text);
		bookCategMenu.setBounds(110, 95, 95, 22);
		panel_1.add(bookCategMenu);
		
		JMenu mnNewMenu = new JMenu("Category");
		bookCategMenu.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Action");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Romance");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Suspense");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Documentary");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_1_1 = new JMenuItem("Others");
		mnNewMenu.add(mntmNewMenuItem_1_1);
		
		JTextPane txtpnBookCategory = new JTextPane();
		txtpnBookCategory.setText("Book Category");
		txtpnBookCategory.setForeground(SystemColor.desktop);
		txtpnBookCategory.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		txtpnBookCategory.setEnabled(false);
		txtpnBookCategory.setEditable(false);
		txtpnBookCategory.setBackground(SystemColor.info);
		txtpnBookCategory.setBounds(10, 97, 90, 20);
		panel_1.add(txtpnBookCategory);
		
		JButton btnAddBook = new JButton("Add Book");
		btnAddBook.setBounds(362, 184, 90, 34);
		panel_1.add(btnAddBook);
		btnAddBook.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		JTextPane txtpnBookAuthor = new JTextPane();
		txtpnBookAuthor.setText("Book Author");
		txtpnBookAuthor.setForeground(SystemColor.desktop);
		txtpnBookAuthor.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		txtpnBookAuthor.setEnabled(false);
		txtpnBookAuthor.setEditable(false);
		txtpnBookAuthor.setBackground(SystemColor.info);
		txtpnBookAuthor.setBounds(278, 33, 74, 20);
		panel_1.add(txtpnBookAuthor);
		
		JTextPane InsertBookId_1 = new JTextPane();
		InsertBookId_1.setForeground(SystemColor.scrollbar);
		InsertBookId_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		InsertBookId_1.setBounds(362, 33, 108, 20);
		panel_1.add(InsertBookId_1);
		
		JTextPane txtpnBookPages = new JTextPane();
		txtpnBookPages.setText("Book Pages");
		txtpnBookPages.setForeground(SystemColor.desktop);
		txtpnBookPages.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 11));
		txtpnBookPages.setEnabled(false);
		txtpnBookPages.setEditable(false);
		txtpnBookPages.setBackground(SystemColor.info);
		txtpnBookPages.setBounds(278, 64, 74, 20);
		panel_1.add(txtpnBookPages);
		
		JTextPane InsertBookId_1_1 = new JTextPane();
		InsertBookId_1_1.setForeground(SystemColor.scrollbar);
		InsertBookId_1_1.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));
		InsertBookId_1_1.setBounds(362, 64, 108, 20);
		panel_1.add(InsertBookId_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaptionBorder);
		panel_2.setBounds(0, 0, 184, 474);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Inventory");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(33, 93, 114, 47);
		panel_2.add(btnNewButton);
		
		JButton btnSearchBook = new JButton("Search Book");
		btnSearchBook.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent e) {
			}
		});
		btnSearchBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSearchBook.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSearchBook.setBounds(33, 163, 114, 47);
		panel_2.add(btnSearchBook);
		
	
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
