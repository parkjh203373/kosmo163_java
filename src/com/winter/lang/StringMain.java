package com.winter.lang;

public class StringMain {
	
	public static void main(String[] args) {
		String name = "winter";
		char ch = name.charAt(0);
		
		Object obj = new Object();
		String s1 = obj.toString();
		String s2 = name.toString();
		
		System.out.println(s1);
		System.out.println(s2);
		
		Object obj2 = new Object();
		boolean c = obj.equals(obj2);
		System.out.println(c);
		
		String name2 = "winter";
		c = name.equals(name2);
		System.out.println(c);
		name2 = "Winter";
		c = name.equals(name2);
		System.out.println(c);
		c = name.equalsIgnoreCase(name2);
		System.out.println(c);
		
		
	}

}
