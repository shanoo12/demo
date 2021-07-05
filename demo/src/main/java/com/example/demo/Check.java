package com.example.demo;
import java.util.ArrayList;
import java.util.List;
public class Check {
	public static void main(String[] args) {
		List<List<List<Integer>>>a=new ArrayList<List<List<Integer>>>();
		List<List<Integer>> b=new ArrayList<List<Integer>>();
		List<Integer> c=new ArrayList<Integer>();
		c.add(5);
		b.add(c);
		a.add(b);
		System.out.println(a.get(0).get(0).get(0));
	}
}
