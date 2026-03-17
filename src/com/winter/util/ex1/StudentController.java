package com.winter.util.ex1;

import java.util.Scanner;

public class StudentController {
	
	public void start() {
		Scanner sc =  new Scanner(System.in);
		StudentService ss = new StudentService();
		StudentDTO[] ar = null;
		StudentView sv = new StudentView();
		
		boolean flag = true;
		while(flag) {
			System.out.println("1. 학생 정보 초기화, 2. 학생 정보 출력, 3. 학생 정보 검색, 4. 종 료");
			int num = sc.nextInt();
			if(num==1) {
				ar = ss.init();
			}else if(num==2) {
				sv.view(ar);
			}else if(num==3){
				StudentDTO sd = ss.search(ar);
				sv.view(sd);
			}else {
				break;
			}
			
			
		}
		
		
		
	}

}
