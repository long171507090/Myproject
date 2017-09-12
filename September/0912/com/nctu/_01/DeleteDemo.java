package com.nctu._01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.nctu02.dao.userdao;
import com.nctu02.user.Users;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteDemo {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteDemo window = new DeleteDemo();
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
	public DeleteDemo() {
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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(63, 55, 319, 174);
		frame.getContentPane().add(scrollPane);
		
		userdao dao = new userdao();
		List<Users> list = dao.showAll();
		int j = list.size();
		Object[][] data = new Object[j][4];
		
		for (int i = 0; i < list.size(); i++) {
			Users users = list.get(i);
		    data[i][0] = users.getName();
	        data[i][1] = users.getSax();
		    data[i][2] = users.getHobby();
		    data[i][3] = users.getBirthday();						
			
		}
		table = new JTable();
		table.setModel(new DefaultTableModel(
				data,
			new String[] {
				"姓名", "性别", "爱好", "生日"
			}
		));
		scrollPane.setViewportView(table);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);
		
		JMenu mnNewMenu = new JMenu("更多");
		popupMenu.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("我是一个子选项");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("删除");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {     //添加删除事件
				int n = JOptionPane.showConfirmDialog(
					    null,
					    "确定要删除此项?",
					    "提示",
					    JOptionPane.YES_NO_OPTION);
				if (n == 0) {
					Object obj = table.getValueAt(table.getSelectedRow(), 0);     //table.getSelectedRow() 返回所选定行的索引  没有返回-1
					//System.out.println(table.getSelectedRow());
					userdao dao = new userdao();
					boolean isok = dao.delete((String)obj);         //调用dao方法删除数据
					if (isok) {
						JOptionPane.showMessageDialog(null, "删除成功");
						Object[][] data = null;
						List<Users> list = dao.showAll();
						data = new Object[list.size()][4];
						for (int i = 0; i < list.size(); i++) {
							Users users = list.get(i);
						    data[i][0] = users.getName();
					        data[i][1] = users.getSax();
						    data[i][2] = users.getHobby();
						    data[i][3] = users.getBirthday();						
							
						}
						table.setModel(new DefaultTableModel(
								data,
							new String[] {
								"姓名", "性别", "爱好", "生日"
							}
						));
					}else {
						JOptionPane.showMessageDialog(null, "失败");
					}
				}
				
			}
		});
		popupMenu.add(mntmNewMenuItem);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
