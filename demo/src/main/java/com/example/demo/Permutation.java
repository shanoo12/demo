package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class Permutation {

	
	public static void main(String[] args) {
		Set<String> pr=permutation("ABCD");
		System.out.println(pr);
	}
	
	static Set<String> permutation(String word)
	{
		Set<String> per=new HashSet<>();
				
		if(word.isEmpty())
		{
			per.add("");
			return per;
		}
		char first=word.charAt(0);
		String rem=word.substring(1);

		Set<String> strNew=permutation(rem);
		for(String st:strNew)
		{
			for(int i=0;i<=st.length();i++)
			{
				per.add(addChar(st,i,first));
			}
		}
		return per;
	}
	
	static String addChar(String a,int i,char c)
	{
		return a.substring(0,i)+c+a.substring(i);
	}
}
