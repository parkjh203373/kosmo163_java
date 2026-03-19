package com.winter.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {
	
	public static void main(String[] args) {
		String name = "winter";
		File file = new File("C:\\PJH\\sub1\\sub2\\info.txt");
		System.out.println(file.exists());
		
		try {
			FileWriter fw = new FileWriter(file, true);
			fw.write(name + "\n");
			fw.flush();//buffer를 강제로 비움
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("종료");
		
		
		
	}

}
