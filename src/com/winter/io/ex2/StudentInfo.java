package com.winter.io.ex2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentInfo {
	
	public ArrayList<StudentDTO> init() {
		//info.txt의 내용을 출력
		File file = new File("C:\\PJH\\sub1\\sub2\\info.txt");
		ArrayList<StudentDTO> list = new ArrayList<>();
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			String s = null;
			while((s = br.readLine()) != null) {
				String[] ar = s.split("-");
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(ar[0]);
				studentDTO.setKor(Integer.parseInt(ar[1]));
				studentDTO.setKor(Integer.parseInt(ar[2]));
				studentDTO.setKor(Integer.parseInt(ar[3]));
				list.add(studentDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}

}