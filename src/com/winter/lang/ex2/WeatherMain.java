package com.winter.lang.ex2;

public class WeatherMain {
	
	public static void main(String[] args) {
		WeatherMaker wm = new WeatherMaker();
		WeatherDTO[] ar = wm.init();
		
		for(int i=0; i<ar.length; i++) {
			ar[i].toString();
		}
		
		
	}

}
