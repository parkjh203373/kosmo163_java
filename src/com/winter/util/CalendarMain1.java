package com.winter.util;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		Calendar out = Calendar.getInstance();
		//calendar.set(Calendar.YEAR, 2030);
		//calendar.set(Calendar.MONTH, 3);
		Date date = calendar.getTime();

		System.out.println(date);
		
		int y = calendar.get(calendar.YEAR);
		int m = calendar.get(calendar.MONTH);
		int h = calendar.get(calendar.HOUR_OF_DAY);
		int min = calendar.get(calendar.MINUTE);
		int s = calendar.get(calendar.SECOND);
		
		System.out.println(y);
		System.out.println(m);
		System.out.println(h);
		System.out.println(min);
		System.out.println(s);
		
		//들어간 시간
		long in = calendar.getTimeInMillis();
		long ou = out.getTimeInMillis();
		long result = ou - in;
		result = result / 1000 / 60;
		System.out.println(result);
		
		
	}

}
