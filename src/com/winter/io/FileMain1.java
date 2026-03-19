package com.winter.io;

import java.io.File;

public class FileMain1 {
	
	public static void main(String[] args) {
		File file = new File("C:\\PJH\\study");
		boolean check = file.exists();
		check = file.isDirectory();
		System.out.println(check);
		
		file.mkdir();
		
		file = new File("C:\\PJH");
		
		String[] list = file.list();
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i]);
		}
		
		file = new File(file, "study");
		
		file.delete();
		
//		file = new File("C:\\PJH", "study2");
//		
//		file.delete();
//		
//		list = file.list();
//		
//		for(int i=0; i<list.length; i++) {
//			File f = new File(file, list[i]);
//			f.delete();
//		}
//		
//		file.delete();
		
		file = new File("C:\\PJH\\sub1\\sub2");
		
		file.mkdirs();
		
		
	}

}
