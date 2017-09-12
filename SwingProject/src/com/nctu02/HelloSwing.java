package com.nctu02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class HelloSwing {
	public static void main(String[] args) throws InterruptedException {
		JFrame jf = new JFrame("hello,JFrame");
		final JLabel jl = new JLabel("a Label");
		final JTextField txt = new JTextField();
		jf.add(jl);
		jf.add(txt);
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				jl.setText("我是个文本框");
				
			}
		});

		jf.setLayout(new FlowLayout());
		JButton jb1 = new JButton("来点我啊");
		jf.add(jb1);
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			 String name = ((JButton)e.getSource()).getText();
			 txt.setText(name);
				
			}
		});
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(300, 200);
		jf.setVisible(true);
	}

}
