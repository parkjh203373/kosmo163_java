package com.winter.util.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	
	public void start() {
		Scanner sc =  new Scanner(System.in);
		StudentService ss = new StudentService();
		ArrayList<StudentDTO> ar = null;
		StudentView sv = new StudentView();
		
		boolean flag = true;
		while(flag) {
			System.out.println("1. 학생 정보 초기화, 2. 학생 정보 출력, 3. 학생 정보 검색, 4. 학생 정보 추가, 5. 학생 정보 삭제, 6. 학생 정보 백업, 7. 종 료");
			int num = sc.nextInt();
			if(num==1) {
				ar = ss.init();
			}else if(num==2) {
				sv.view(ar);
			}else if(num==3){
				StudentDTO sd = ss.search(ar);
				if(sd!=null) {
					sv.view(sd);
				}else {
					System.out.println("찾는 학생이 없습니다");
				}
			}else if(num==4) {
				ar = ss.add(ar);
			}else if(num==5) {
				ss.delete(ar);
			}else if(num==6) {
				ss.backup();
			}else {
				break;
			}
			
			
		}
		
		
		
	}

}
