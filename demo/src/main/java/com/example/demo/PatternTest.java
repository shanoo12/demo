package com.example.demo;

import java.util.HashMap;

public class PatternTest {

	
	public static void main(String[] args) {
		boolean result=true;
		 HashMap<Character,String> check=new HashMap<Character,String>();
		 String pattern="abbf";
		 String str="dog cat cat dog";
	        char[] p=pattern.toCharArray();
	        String[] s=str.split(" ");
	        if(p.length!=s.length)
	        	result= false;
	        
	        
	        for(int i=0;i<p.length;i++){
	            if(check.containsKey(p[i])||check.containsValue(s[i]))
	            {
	            	if(check.get(p[i])==null)
	            		result=false;
	                if(!check.get(p[i]).equals(s[i]))
	                	result= false;
	                    
	            }else{
	                check.put(p[i],s[i]);
	            }
	        }
	        //result=true;
	        System.out.println("Result "+result);
	    }
	
	
}
