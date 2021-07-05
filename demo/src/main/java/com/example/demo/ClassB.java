package com.example.demo;

public class ClassB {
	private static boolean isPresent=false;
	public ClassB() {
		if(isPresent)
				throw new  RuntimeException();
		isPresent=true;
	}
	
	public static void main(String[] args) {
		ClassB b=new ClassB();
		ClassB a=new ClassB();
		System.out.println("Here");
	}
}
