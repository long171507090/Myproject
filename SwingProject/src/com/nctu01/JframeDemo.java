package com.nctu01;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;

public class JframeDemo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void CreateJFrame(String title){
		JFrame jf = new JFrame(title);
		Container container = jf.getContentPane();
		JLabel jl = new JLabel("这是一个JFrame窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(600, 450);
	}
	public static void main(String[] args) {
		new JframeDemo().CreateJFrame("创建一个JFrame窗体");
	}

}
