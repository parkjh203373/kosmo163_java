package com.winter.lang.ex2;

public class WeatherMaker {
	
	private String info;
	
	public WeatherMaker() {
		this.info = "서울-대전-대구-부산-인천-제주";
	}
	
	public WeatherDTO[] init() {
		//info의 데이터를 파싱해서 결과물을 리턴
		String[] ar = this.info.split("-");
		WeatherDTO[] dto = new WeatherDTO[6];
		
		for(int i=0; i<ar.length; i++) {
			dto[i] = new WeatherDTO();
			dto[i].setCityName(ar[i]);
		}
		
		return dto;
		
	}

}
