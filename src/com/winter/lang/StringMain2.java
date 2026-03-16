package com.winter.lang;

public class StringMain2 {
	
	public static void main(String[] args) {
		String str = "Hello World";
		char ch = str.charAt(0);
		
		int idx = str.indexOf("l");
		System.out.println(idx);
		
		idx = str.lastIndexOf('l');
		System.out.println(idx);
		
		//l이 총 몇개 인지 구하자
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			if(ch == 'l') {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

}
