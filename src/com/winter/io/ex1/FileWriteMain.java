package com.winter.io.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteMain {
	
	public static void main(String[] args) {
		// 키보드로부터 입력받은 메세지를
		// sub2//msg.txt 파일에 저장
		// exit를 입력하면 쓰지말고 프로그램 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("메세지 입력");
		
		File file = new File("C:\\PJH\\sub1\\sub2\\msg.txt");
		
		try {
			FileWriter fw = new FileWriter(file, true);
			while (true) {
				String str = sc.nextLine();
				if (str.equalsIgnoreCase("exit")) {
					System.out.println("프로그램 종료");
					break;
				}
				fw.write(str + "\n");
				fw.flush();
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}