package com.winter.lang;

public class WrapperMain1 {
	
	public static void main(String[] args) {
		String n = "123";
		Integer integer = new Integer(n);
		
		integer = Integer.valueOf(n);
		Long l = Long.valueOf(n);
		System.out.println(integer + 1);
		System.out.println(l + 1);
		
		//auto-boxing, auto-unboxing
		int num = 3;
		integer = num; //auto-boxing
		num = integer; //auto-unboxing
		
		long number = 3L;
		integer = (int)number; //auto-unboxing + auto-boxing
		//parsing
		num = Integer.parseInt(n);
		
		
		
		
	}

}
