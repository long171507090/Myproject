package com.nctu01;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
class myJDialog extends JDialog{
	public myJDialog (Test2 frame){
	super(frame,"第一个JD窗体",true);
	Container container = getContentPane();
	container.add(new JLabel("这是一个对话框"));
	setBounds(120, 120, 200, 150);
	}
}

public class Test2 extends JFrame {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		new Test2();
		
	}
	public Test2(){
		Container container = getContentPane();
		JLabel jl = new JLabel("这是一个窗体");
		container.add(jl);
		JButton bl = new JButton("弹出对话框");
		bl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new myJDialog(Test2.this).setVisible(true);
			}
		});
		container.add(bl);
		container.add(bl);
		setSize(500,300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}

}
