package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class TestExample {

	
	public static void main(String[] args) {
		char[]  a= {'1','a','v','a','a','b','b','a','a','a','c','c','q','q','q','q','a','b'};  
		Map<Character,Integer>  ch=new HashMap<>();
		int count=1;
		for(int i=0;i<a.length-1;i++)
		{
			
			if(!ch.containsKey(a[i]))
			{
				ch.put(a[i], 1);
			}
			if(ch.containsKey(a[i])&&a[i]==a[i+1])
			{
				count++;
			}
			if(ch.containsKey(a[i])&&ch.get(a[i])<count)
			{
				ch.put(a[i], count);
				
			}
			if(a[i]!=a[i+1])
			{
				count=1;
			}
		}
		System.out.println(ch);
		
		
	}
	
	
}
