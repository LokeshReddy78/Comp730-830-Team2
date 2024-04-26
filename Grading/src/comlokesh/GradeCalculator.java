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



public class GradeCalculator extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GradeCalculator frame = new GradeCalculator();
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
	public GradeCalculator(){
		setTitle("Student Grade Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 553);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 245, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("University of New Hampshire");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(141, 26, 259, 24);
		contentPane.add(lblNewLabel);
		
		table = new JTable();
		table.setBackground(new Color(173, 216, 230));
		table.setBounds(270, 349, 1, 1);
		contentPane.add(table);
		
		JLabel lblNewLabel_1 = new JLabel("Student ID");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 87, 98, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(97, 85, 92, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Student Name");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(270, 87, 98, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(378, 85, 158, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		String columns[] = {
				"Course Name", "Credits", "Grade"
			};
		DefaultTableModel model = new DefaultTableModel();
		model.setColumnIdentifiers(columns);
		
		JLabel lblNewLabel_3 = new JLabel("Course Name");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 149, 98, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(141, 147, 185, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		 JLabel lblNewLabel_4 = new JLabel("Credits");
		 lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		 lblNewLabel_4.setBounds(10, 185, 63, 14);
		 contentPane.add(lblNewLabel_4);

		 textField_3 = new JTextField();
		 textField_3.setBounds(141, 183, 185, 20);
		 contentPane.add(textField_3);
		 textField_3.setColumns(10);
		 
		 JLabel lblNewLabel_5 = new JLabel("Grade");
		 lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		 lblNewLabel_5.setBounds(10, 221, 46, 14);
		 contentPane.add(lblNewLabel_5);
		 
		 textField_4 = new JTextField();
		 textField_4.setBounds(141, 219, 185, 20);
		 contentPane.add(textField_4);
		 textField_4.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
		scrollPane.setBounds(10, 266, 317, 237);
		contentPane.add(scrollPane);
		
		table_1 = new JTable();
		scrollPane.setViewportView(table_1);
		table_1.setBackground(new Color(255, 255, 255));
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setRowSelectionAllowed(false);
		table_1.setModel(model);
		table_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		



