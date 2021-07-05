package com.example.demo;

import java.util.Scanner;

public class ClassA {
		public static void main(String[] args) {
			ClassB b=new ClassB();
			ClassB a=new ClassB();
			System.out.println("Here");
			Scanner in = new Scanner(System.in); 
			  
	        String s = in.nextLine(); 
	        int count =Integer.parseInt(s);
	        String ar[]=new String[count];
	        int i=0;
	        while(i<count) {
	        	String data= in.nextLine(); 
	        	
	        	ar[i++]=data;
	        }
	        for(String m:ar)
	        {
	        	System.out.println(getBrackets(m));
	        }
			
		}
		public static String getBrackets(String s)
		{
			StringBuilder sb=new StringBuilder("");
			int predepth=0;int depth=0;
			char[] charAr=s.toCharArray();
			for(int j=0;j<charAr.length;j++) {
				int i=charAr[j]-'0';
				depth=charAr[j]-'0';
				int nextDepth=0;
				while(predepth-depth>0)
				{
					sb.append(")");
					depth++;
				}
				while(i-predepth>0) {
					sb.append("(");
					i--;
				}
				
				sb.append(charAr[j]);
			
			 
			 
			
				predepth=charAr[j]-'0';
			}
			while(predepth>0)
			{
				sb.append(")");
				predepth--;
			}
			
			return sb.toString();
		}
}
