package com.winter.lang.ex1;

public class StringEx1Main {
	
	public static void main(String[] args) {
		String str = "Hello World";
		int length = str.length();
		System.out.println(length);
		
		for(int i=0; i<length; i++) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}
		
		String s = String.valueOf(false);
		System.out.println("\n" + s);
		
		
		
	}

}
