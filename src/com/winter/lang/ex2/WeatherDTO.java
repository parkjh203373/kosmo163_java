package com.winter.lang.ex2;

public class WeatherDTO {
	
	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public String toString() {
		System.out.println(this.getCityName());
		return "";
	}

}
