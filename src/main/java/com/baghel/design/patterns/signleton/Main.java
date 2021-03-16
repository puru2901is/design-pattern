package com.baghel.design.patterns.signleton;

public class Main {

	public static void main(String[] args) {
		SingletonForCache s = SingletonForCache.getInstance();
		System.out.println(s);
		SingletonForCache s1 = SingletonForCache.getInstance();
		System.out.println(s1 == s);
		
	}
}
