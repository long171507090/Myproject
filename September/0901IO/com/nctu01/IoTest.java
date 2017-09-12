package com.nctu01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IoTest {
	private static StringBuffer str1 = new StringBuffer();
	public static void main(String[] args) {
		File file = new File("D:/AppStore");
		files2(file);
			try {
				FileWriter file1 = new FileWriter("D:/read.txt");
				file1.write(str1.toString());
				System.out.println("写入成功");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
  public static void files(File file){
//	  案例2:在案例1的基础上，将目录（文件夹）和文件分别做一个说明
	  if(file.exists()){
			 File[] files = file.listFiles();
			for (File file2 : files) {
				if(file2.isFile()){
					System.out.println(file2+"\t是文件");
				}
				else{
					System.out.println(file2+"\t是目录");
				}
			}
		}else{
			System.out.println("文件不存在");
		}
	  
  }
//  案例3:在上面案例的基础上，希望能够遍历某个目录下的子目录和文件，直到整个目录下没有文件夹为止. 
  public static void files2(File file){
	  if(file.exists()){
		  File[] files = file.listFiles();
		  for (File file2 : files) {
			if(file2.isFile()){
				System.out.println(file2.getAbsolutePath()+"\t"+file2.length()+"\t"+
			new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date(file2.lastModified())));
				str1.append(file2.getAbsolutePath()+"\t"+file2.length()+"\t"+
			new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss").format(new Date(file2.lastModified()))+"\r\n");
			}else{
				files2(file2);
			}
			
		}
		  
	  }else{
		  System.out.println("文件不存在");
	  }
	  
  }
}
