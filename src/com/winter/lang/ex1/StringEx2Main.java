package com.winter.lang.ex1;

import java.util.Scanner;

public class StringEx2Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String fileName = sc.next();
		
		//파일명 -> 이름.확장자
		//이미지파일인지 체크, jpg, png, gif, jpeg
		//abc.png, test.pdf, hello.PNG
		//이미지 파일입니다. 이미지 파일이 아닙니다.
		int idx = fileName.lastIndexOf('.');
		String str = fileName.substring(idx+1);
		if(str.equalsIgnoreCase("jpg") || str.equalsIgnoreCase("png") ||
				str.equalsIgnoreCase("gif") || str.equalsIgnoreCase("jpeg")) {
			System.out.println("이미지 파일입니다");
		} else {
			System.out.println("이미지 파일이 아닙니다");
		}
		
		//---------------------------------------------------
		String[] files = {"jpg", "png", "gif", "jpeg"};
		
		String result = "이미지 파일이 아닙니다";
		for(int i=0; i<files.length; i++) {
			if(str.equalsIgnoreCase(files[i])) {
				result = "이미지 파일입니다";
				break;
			}
		}
		System.out.println(result);
		
		
		
	}

}
