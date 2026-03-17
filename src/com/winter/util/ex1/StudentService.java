package com.winter.util.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
	
	private String data;
	
	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
	}
	
	public StudentDTO[] init() {
		//data 파싱 작업
		System.out.println("==========================");
		StringTokenizer st = new StringTokenizer(this.data, "-");
		StudentDTO[] ar = new StudentDTO[3];
		int index = 0;
		
		while(st.hasMoreTokens()) {
			StudentDTO sd = new StudentDTO();
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			String s3 = st.nextToken();
			String s4 = st.nextToken();
			sd.setName(s1);
			sd.setKor(Integer.parseInt(s2));
			sd.setEng(Integer.parseInt(s3));
			sd.setMath(Integer.parseInt(s4));
			ar[index] = sd;
			index++;
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			System.out.println("==========================");
			
		}
		
		return ar;
		
	}
	
	//학생검색
	public void search() {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
	}

}
