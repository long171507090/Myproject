package com.nctu03;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class NestDemo {
	public static void main(String[] args) {
		JFrame jf = new JFrame("这是个嵌套窗体");
		jf.setLayout(new BorderLayout());
		JPanel westJPanel = new JPanel();
		westJPanel.setBackground(Color.GREEN);
		jf.add(westJPanel, BorderLayout.WEST);
		westJPanel.setPreferredSize(new Dimension(60,60));
		
		JPanel southJPanel = new JPanel();
		southJPanel.setBackground(Color.YELLOW);
		southJPanel.setPreferredSize(new Dimension(60,60));
		jf.add(southJPanel, BorderLayout.SOUTH);
		
		JPanel center = new JPanel();
		jf.add(center, BorderLayout.CENTER);
		center.setLayout(new BorderLayout());
		JPanel topJPanel = new JPanel();
		topJPanel.setBackground(new Color(255, 0, 0));
		topJPanel.setPreferredSize(new Dimension(45,45));
		center.add(topJPanel, BorderLayout.NORTH);
		
		JPanel centerJPanel = new JPanel();
		center.add(centerJPanel, BorderLayout.CENTER);
		
		centerJPanel.setLayout(new FlowLayout());
		for (int i = 0; i < 10; i++) {
			centerJPanel.add(new JButton("我是一个按钮"+i));
		}
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(200, 200, 500, 350);
		jf.setVisible(true);
	}

}
