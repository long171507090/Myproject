package com.nctu01;

import java.awt.Container;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Test extends JFrame {
	public void abc(String title){
		JFrame js = new JFrame(title);
		Container container = js.getContentPane();
		JLabel jl = new JLabel("这是一个窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		js.setVisible(true);
		js.setSize(500, 300);
	}
	public static void main(String[] args) {
		new Test().abc("创建一个窗体");
	}

}
