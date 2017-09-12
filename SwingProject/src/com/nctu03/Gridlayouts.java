package com.nctu03;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gridlayouts {
	public static void main(String[] args) {
        JFrame jFrame = new JFrame("网格布局");
		jFrame.setLayout(new GridLayout(3, 2, 10, 10));
		for (int i = 0; i < 6; i++) {
			jFrame.add(new JButton("按钮"+i));
		}
		
		jFrame.setBounds(200, 200, 500, 350);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}

}
