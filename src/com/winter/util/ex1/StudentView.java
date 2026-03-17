package com.winter.util.ex1;

public class StudentView {
	
	public void view(StudentDTO[] ar) {
		for(int i=0; i<ar.length; i++) {
			this.view(ar[i]);
		}
		
	}
	
	public void view(StudentDTO DTO) {
		System.out.println("이름 : " + DTO.getName());
		System.out.println("국어 : " + DTO.getKor());
		System.out.println("영어 : " + DTO.getEng());
		System.out.println("수학 : " + DTO.getMath());
		
		
	}
	

}
