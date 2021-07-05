package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestStringChain {

	
	public static void main(String[] args) {
		String [] arr= {"a","aa","ab","abc","acd","abcd","eabcd","eeabcde"};
		int maxCount=0; int currentMax=0;
		HashSet<String> words=new HashSet<String>(Arrays.asList(arr));
		HashMap<String,Integer> maxChainCount=new HashMap<String,Integer>();
		for(String a:arr) {
			if(maxCount>a.length()) {
			continue;
			}
			
			currentMax=findTheMaxChain(a,words,maxChainCount)+1;
			maxChainCount.put(a, currentMax);
			maxCount=Math.max(currentMax, maxCount);
		}
		
		System.out.println("maxCount"+maxCount);
	}

	private static int findTheMaxChain(String a, HashSet<String> words, HashMap<String, Integer> maxChainCount) {
		int currentMaxCount=0;
		for(int i=0;i<a.length();i++) {
			String newWord=a.substring(0,i)+a.substring(i+1);
			if(words.contains(newWord))
			{
				if(maxChainCount.containsKey(newWord)) {
					currentMaxCount=Math.max(currentMaxCount, maxChainCount.get(newWord));
					
				}else {
					int nextMax=findTheMaxChain(a,words,maxChainCount);
					currentMaxCount=Math.max(currentMaxCount, nextMax+1);
					
					
				}
			}
		}
		return currentMaxCount;
	}
}
