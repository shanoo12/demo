package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class Microsoft {
public static void main(String[] args) {
	String a[]={"cha","r","act","ers"};
	List<String> stringlist=Arrays.asList(a) ;
	int result[]=new int[1];
			maxUnique(stringlist,0,"",result); 
			System.out.println("max count"+result[0]);
			
		}


private static void maxUnique(List<String> a, int i, String string, int result[]) {
	if(i==a.size()&&getUniqueCount(string)>result[0])
	{
		result[0]=getUniqueCount(string);
		return;
	}
	if(i==a.size())
	{
		return;
	}
	maxUnique(a,i+1,string,result);
	maxUnique(a, i+1, string+a.get(i), result);
}


public static int getUniqueCount(String s)
{
	int a[]=new int[26];
	for(char b:s.toCharArray()) {
		if(a[b-'a']++>0) {
			return -1;
		}
	}
	return s.length();
}
}
