package com.baghel.design.patterns.interview;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		Stack<Integer> s = new Stack<>();
		s.add(5);
		s.add(4);
		s.add(3);
		s.add(2);
		s.add(1);
		int count = 0;
		m.deleteMiddleElement(s,s.size(),count);
		
		System.out.println(s.toString());
		
	}
	
	private void deleteMiddleElement(Stack<Integer> s, int size,int count) {
		if(s.isEmpty()) {
			return;
		}		
		int a = s.pop();
		deleteMiddleElement(s,size,++count);
		System.out.println(count + "  ....  "+ size);
		if(count != size/2) {
			System.out.println(a);
			s.push(a);	
		}	
	}

}
