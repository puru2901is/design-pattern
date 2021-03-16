package com.baghel.design.patterns.observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Shopping {

	public static void main(String[] args) {
		
		
		Product p1  = new Product("P1", 500);
		Product p2 = new Product("P2");
		
		System.out.println(p1 == p2);
		System.out.println(p2);
		User u1 = new User("1", "baghel");
		User u2 = new User("2", "amit");
		//User u3 = new User("3", "Ankur");
		p1.addObserver(u1);
		p1.addObserver(u2);
		p1.setNumberOfAvailableProducts(10);
		//p1.setPrice(1000);
		
		
		//HashMap<Character, Integer> map =  new HashMap<>();
		   List<Integer> bits = new ArrayList<>();
	        int num =5;
	        while(num !=1){
	            bits.add(num % 2);
	            num = num/2;
	            //System.out.println(num);
	        }
	        bits.add(1);   
	       for(int i=0; i<bits.size();i++){
	           System.out.println(bits.get(i));
	           if(bits.get(i) == 0){
	        	   bits.remove(i);
	               bits.add(i,1);
	           } else {
	        	   bits.remove(i);
	               bits.add(i,0);
	           }
	       }
	       
	       Map< Integer, Integer> map  = new HashMap<Integer, Integer>();
	       map.put(10, 10);
	       
	       Set<Integer> set = new HashSet<>();
	       set.add(11);
	       for (Integer i: set) {
			System.out.println(i);
		}
	}
}
