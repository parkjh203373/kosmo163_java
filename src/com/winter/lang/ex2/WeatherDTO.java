package com.winter.lang.ex2;

public class WeatherDTO {
	
	private String cityName;
	private int temp;
	private double humidity;
	
	

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	public double getHumidity() {
		return humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

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
