package com.example.demo;

public class Test3 {
	public static void main(String[] args) {
		int arr[]= {1,1,2,3,2,4,3};
		int x=0;
		for(int i:arr) {
			x=x^i;
		}
		System.out.println("x"+x);
	}
}
