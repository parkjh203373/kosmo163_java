package com.winter.biman;

public class Member {
	
	private String name;
	private int age;
	private double weight;
	private double height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	// 변수에 저장된 데이터를 출력하는 메서드 추가
	public void printMemberInfo() {
	    System.out.println("이름: " + name);
	    System.out.println("나이: " + age);
	    System.out.println("몸무게: " + weight);
	    System.out.println("키: " + height);
	}
}