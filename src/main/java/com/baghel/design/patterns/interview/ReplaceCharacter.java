package com.baghel.design.patterns.interview;

public class ReplaceCharacter {

	public static void main(String[] args) {
		String s = "abppprrr";
		int sum = 0;
		int x =5;
		int y =4;
		int max = Math.max(x, y);
		if(max == x) {
			while(s.contains("pr")) {
				s = s.replaceFirst("pr", "");
				sum += x;
			}
			while(s.contains("rp")) {
				s = s.replaceFirst("rp", "");
				sum += y;
			}
		} else {
			while(s.contains("rp")) {
				s = s.replaceFirst("rp", "");
				sum += y;
			}
			while(s.contains("pr")) {
				s = s.replaceFirst("pr", "");
				sum += x;
			}
			
		}
		
		System.out.println("sum "+sum);
		
	}

}
