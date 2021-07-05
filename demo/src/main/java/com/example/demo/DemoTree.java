package com.example.demo;

import java.util.TreeSet;
import java.util.stream.Collectors;

public class DemoTree {

	
	public static void main(String[] args) {
		DemoTree dt=new DemoTree();
		int a =dt.lengthOfLongestSubstring("aaa");
	System.out.println("main"+a);
	}
	
	 public int lengthOfLongestSubstring(String s) {
	        char [] a=s.toCharArray();
	        int i = 0,tempSize=0,largeSize=0;
	        String temp="";
	        String largest="";
	        while(i<a.length)
	        {

	        		//add the letters to temp array till a repeat detected
	        	//add the temp into largest string
	        	
	        	//incase of a repeated char find the index of that repeated char in temp array substr it from there then call the first statement
	        	//
	            i++;
	        }
	        System.out.println(largest);
	        return largest.length();
	    }
	
}
