package com.example.demo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TestDemo {

	public static void main(String[] args) {
		//String s="tenant";
		//int i=0;	
		
		//int c=(char)(s.charAt(i)-'1'+'a');
		//int t=(char)(Integer.parseInt(s.substring(i,i+2))-1+'a'); 
		Map<String,String> map=new HashMap<String, String>();
		map.put("1", "b");
		map.put("2", "a");
		map.put("3", "d");
		map.put("4", "c");
		Map<String, String> sortedMap = map.entrySet().stream().
				sorted(Entry.comparingByValue())                 
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,  (e1, e2) -> e1, LinkedHashMap::new));
		sortedMap.forEach((x,y)->
		System.out.println("The Key"+x+" Value"+y));
	}
}
