package com.nctu02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.nctu02.dao.userdao;
import com.nctu02.user.Users;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class Query {

	JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Query window = new Query();
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
	public Query() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(90, 35, 108, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("请输入查询名字:");
		lblNewLabel.setBounds(90, 10, 108, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("查询性别:");
		label.setBounds(235, 10, 80, 15);
		frame.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(235, 35, 108, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		
		JButton btnNewButton = new JButton("查  询");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				String sax = textField_1.getText();
				userdao dao = new userdao();
				List<Users> list = dao.query(name,sax);
				Object[][] data = new Object[list.size()][4];
				for (int i = 0; i <list.size();i++) {
					
					data[i][0] = list.get(i).getName();
					data[i][1] = list.get(i).getSax();
					data[i][2] = list.get(i).getHobby();
					data[i][3] = list.get(i).getBirthday();
				}
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(90, 66, 273, 115);
				frame.getContentPane().add(scrollPane);
				
				table = new JTable();
				
				table.setModel(new DefaultTableModel(
						data,
					new String[] {
						"姓名", "性别", "爱好", "生日"
					}
				));
				scrollPane.setViewportView(table);
				
				
			}
		});
		btnNewButton.setBounds(90, 191, 93, 30);
		frame.getContentPane().add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("返  回");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jframe2 window = new Jframe2();
				window.frame.setVisible(true);
				frame.setVisible(false);
			}
		});
		btnNewButton_1.setBounds(251, 191, 93, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
	
}
