package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class CompressDemo {
	public static void main(String[] args) {
		String demo="a21b551c3b5q1e33e55a5555";
		char[] a=demo.toCharArray();
		
		char tempChar;
		String tempCount="";
		HashMap<Character,Integer>  charValue=new HashMap<Character,Integer>();
		for(int i=0;i<a.length;)
		{
			
			tempChar=' ';
			tempCount="";
			
			if(a[i]<47||a[i]>57)
			{ 
				tempChar=a[i];
				i++;
				while(i<a.length&&a[i]>47&&a[i]<57)
				{
					tempCount+=a[i];
					i++;
				}
				if(!charValue.containsKey(tempChar))
				{
					charValue.put(tempChar,Integer.parseInt(tempCount) );
				}
						
				
				 else if(charValue.containsKey(tempChar))
				 {
					 charValue.put(tempChar,
							 Integer.parseInt(tempCount)+charValue.get(tempChar));
				 }
				
				 
				
			}
			
			 
			
		}
		
		StringBuilder sb=new StringBuilder("");
		for(Map.Entry<Character,Integer> temp:charValue.entrySet())
		{
			sb.append(temp.getKey());
			sb.append(temp.getValue());
		}
		System.out.println(sb);
	}
	
	
	
	
}
