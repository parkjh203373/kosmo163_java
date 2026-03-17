package com.winter.lang.ex3;

import java.util.Scanner;

public class WrapperService {
	
	public void juminCheck(Scanner sc) {
		System.out.println("주민번호을 입력 : xxxxxx-xxxxxxx");
		String data = sc.next();
		data = data.replace("-", "");
		
		int c = 0;
		int sum= 0;
		for(int i=0; i<data.length()-1; i++) {
			c = Integer.parseInt(data.substring(i, i+1));
			if(i<8) {
				sum += c*(i+2);
			}else {
				sum += c*(i-6);
			}
		}
		
		int result = 0;
		int n = sum % 11;
		if(11-n>=10) {
			result = sum % 10;
		}else {
			result = 11 - n;
		}
		
		int x = Integer.parseInt(data.substring(12));
		if(result == x) {
			System.out.println("올바른 주민번호입니다");
		}else {
			System.out.println("올바르지 않은 주민번호입니다");
		}
		
		
		
	}
	
	public void ageCount2(Scanner sc) {
		System.out.println("주민번호을 입력 : xxxxxx-xxxxxxx");
		String data = sc.next();
		int year = 2026;
		String str = data.substring(0,2);
		String str1 = data.substring(7,8);
		int y = Integer.parseInt(str);
		int x = Integer.parseInt(str1);
		int age = 0;
		if(x==3 || x==4) {
			age = year - (y + 2000) + 1;
		} else {
			age = year - (y + 1900) + 1;
		}
		System.out.println("나이 : " + age);
		
		
	}
	
	public void ageCount(Scanner sc) {
		System.out.println("생년월일을 입력 : xxxx-xx-xx");
		String data = sc.next();
		int year = 2026;
		
		String[] ar = data.split("-");
		int y = Integer.parseInt(ar[0]);
		int age = year - y + 1;
		System.out.println("나이 : " + age);
		
	}

}
