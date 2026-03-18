package com.winter.util.ex2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetEx1 {
	
	public static void main(String[] args) {
		Random random = new Random();
		HashSet<Integer> set = new HashSet<>();
		
		while(true) {
			int n = random.nextInt(45) + 1;
			set.add(n);
			if(set.size()>5) {
				break;
			}
		}
		
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		System.out.println(set);
		
		
	}

}
