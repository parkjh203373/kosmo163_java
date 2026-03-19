package com.winter.util.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentService {
	
	private String data;
	private Scanner sc;
	
	public StudentService() {
		this.data = "iu-50-68-90-winter-87-85-76-suji-87-67-95";
		this.sc = new Scanner(System.in);
	}
	
	public void backup() {
	    // 학생들의 정보를 info.txt에 저장하기
	    File file = new File("C:\\PJH\\sub1\\sub2\\info.txt");

	    try {
	    	FileWriter fw = new FileWriter(file, true);

        	System.out.println("학생 이름 입력");
    	    String name = sc.next();

    	    System.out.println("국어 점수 입력");
    	    int kor = sc.nextInt();

    	    System.out.println("영어 점수 입력");
    	    int eng = sc.nextInt();

    	    System.out.println("수학 점수 입력");
    	    int math = sc.nextInt();

    	    StudentDTO sd = new StudentDTO();
    	    sd.setName(name);
    	    sd.setKor(kor);
    	    sd.setEng(eng);
    	    sd.setMath(math);
    	    
    	    String str = sd.getName() + "-" + sd.getKor() + "-" + sd.getEng() + "-" + sd.getMath();
            fw.write("\n" + str);
            fw.flush();
            
            System.out.println("학생 정보가 info.txt에 저장되었습니다.");
	            
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
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
				studentDTO.setEng(Integer.parseInt(ar[2]));
				studentDTO.setMath(Integer.parseInt(ar[3]));
				list.add(studentDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public ArrayList<StudentDTO> initold() {
		//data 파싱 작업
		System.out.println("==========================");
		StringTokenizer st = new StringTokenizer(this.data, "-");
		//StudentDTO[] ar = new StudentDTO[3];
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		while(st.hasMoreTokens()) {
			StudentDTO sd = new StudentDTO();
			String s1 = st.nextToken();
			String s2 = st.nextToken();
			String s3 = st.nextToken();
			String s4 = st.nextToken();
			sd.setName(s1);
			sd.setKor(Integer.parseInt(s2));
			sd.setEng(Integer.parseInt(s3));
			sd.setMath(Integer.parseInt(s4));
			ar.add(sd);
			System.out.println("==========================");
			
		}
		
		return ar;
		
	}
	
	//학생 검색
	public StudentDTO search(ArrayList<StudentDTO> ar) {
		System.out.println("학생 이름 입력");
		String name = sc.next();
		
		for(int i=0; i<ar.size(); i++){
			if(name.equalsIgnoreCase(ar.get(i).getName())) {
				return ar.get(i);
			}
		}
		
		return null;
		
	}
	
	//학생 추가 add
	//이름, 국어, 영어, 수학 입력
	public ArrayList<StudentDTO> add(ArrayList<StudentDTO> ar) {
	    System.out.println("학생 이름 입력");
	    String name = sc.next();

	    System.out.println("국어 점수 입력");
	    int kor = sc.nextInt();

	    System.out.println("영어 점수 입력");
	    int eng = sc.nextInt();

	    System.out.println("수학 점수 입력");
	    int math = sc.nextInt();

	    StudentDTO sd = new StudentDTO();
	    sd.setName(name);
	    sd.setKor(kor);
	    sd.setEng(eng);
	    sd.setMath(math);

	    ar.add(sd);
	    System.out.println(name + " 학생 추가 완료");
	    
	    return ar;

	}
	
	//학생의 이름을 입력해서 일치하는 학생의 정보를 삭제
	public void delete(ArrayList<StudentDTO> ar) {
		System.out.println("학생 이름 입력");
		String name = sc.next();
		
		for(int i=0; i<ar.size(); i++) {
			if(name.equalsIgnoreCase(ar.get(i).getName())) {
				ar.remove(i);
				System.out.println(name + " 학생 정보 삭제 완료");
			}
		}
		
		
	}
	
	

}