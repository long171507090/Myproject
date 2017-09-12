package com.nctunew;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class CalendarMainClass {
	  public static void main(String args[])   
      {   
           try {  
               UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //windows界面风格  
            }catch (Exception e) {  
              e.printStackTrace();  
            }  
            CalendarFrame frame=new CalendarFrame();   
            frame.setBounds(100,100,360,300);   
            frame.setTitle("日历小程序");  
            frame.setLocationRelativeTo(null);//窗体居中显示  
            frame.setVisible(true);   
            frame.setBackground(Color.ORANGE);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
      }   

}
