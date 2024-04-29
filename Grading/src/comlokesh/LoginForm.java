package comlokesh;

import java.awt.EventQueue;


import java.util.HashMap;
import java.text.DecimalFormat;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Label;
import javax.swing.JScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;

public class LoginForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginForm(){
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 503);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER NAME");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(50, 133, 123, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(51, 182, 132, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 137, 157, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(183, 181, 159, 20);
		contentPane.add(passwordField);
		
		JCheckBox showPwdCheckBox = new JCheckBox("Show Password");
		showPwdCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 14));
		showPwdCheckBox.setBounds(183, 222, 145, 23);
		contentPane.add(showPwdCheckBox);
		showPwdCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (showPwdCheckBox.isSelected()) {
		                passwordField.setEchoChar((char) 0);
		            } else {
		                passwordField.setEchoChar('*');
		            }
			}
		});
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HashMap<String, String> users = new HashMap<String, String>();
				users.put("andy", "@ndy123#");
				users.put("brad", "br@d123#");
				users.put("katharyn", "123456");
				users.put("diego", "d13go#");
				users.put("lokesh", "123456");
				String pwd = new String(passwordField.getPassword());

				if (users.containsKey(textField_1.getText())){
					if (users.get(textField_1.getText()).equals(pwd)) {
						JOptionPane.showMessageDialog(btnNewButton, "Login Successful");
						GradeCalculator frame = new GradeCalculator();
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(btnNewButton, "Incorrect Password");
					}
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "User Not Authorized");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton.setBounds(70, 269, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setText("");
				textField_1.setText("");
			}
		});
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnReset.setBounds(183, 269, 89, 23);
		contentPane.add(btnReset);
		
		
		
		
		
	}
}