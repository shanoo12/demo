package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soultion {
	public static String solve(String s) {
	       char [] arr=s.toCharArray();
	       List<Character> v=new ArrayList<Character>();
	        List<Character> c=new ArrayList<Character>();
	    int i=0;
	    while(i<arr.length)
	    {
	        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
	                v.add(arr[i]);
	        else
	            c.add(arr[i]);
	    }
	        Collections.sort(v);
	        Collections.sort(c);
	        String sb=new String();
	        for(char a:v)
	            sb+=a;
	        for(char b:c)
	            sb+=b;

	        return sb;
	    }
	public static void main(String[] args) {
		System.out.println(solve("decalin"));
	}
}
