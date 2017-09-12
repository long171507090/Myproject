package com.nctu02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.nctu02.dao.userdao;
import com.nctu02.user.Users;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class TableDemo {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableDemo window = new TableDemo();
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
	public TableDemo() {
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
		
		JButton btnNewButton = new JButton("查看所有信息");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] colum = {"姓名","性别","爱好","生日"};
				Object[][] data = new Object[3][4];
				userdao dao = new userdao();
				List<Users> list = dao.showAll();
				for (int i = 0; i <list.size();i++) {
					
					data[i][0] = list.get(i).getName();
					data[i][1] = list.get(i).getSax();
					data[i][2] = list.get(i).getHobby();
					data[i][3] = list.get(i).getBirthday();
				}
				
				TableModel model = new DefaultTableModel(data,colum);
				JTable table = new JTable(model);
				JScrollPane scrll = new JScrollPane(table);
				table.setFillsViewportHeight(true);
				scrll.setBounds(50, 50, 300, 300);
				frame.getContentPane().add(scrll);
			}
		});
		btnNewButton.setBounds(141, 10, 105, 34);
		frame.getContentPane().add(btnNewButton);
	}

}
