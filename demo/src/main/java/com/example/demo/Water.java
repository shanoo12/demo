package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class Water {

	
	public static void main(String[] args) {
		int [] a= {1,8,6,2,5,4,8,3,7};
		int max=0;
		Map<String,Integer> waterC=new HashMap<>();
		int min=0;int water=0;
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length;j++)
			{
				min=Math.min(a[i], a[j]);
				for(int k=i;k<=j;k++) {
					water=water+((min-a[k])>0?(min-a[k]):0);
				}
				if(water>max)
				{
					max=water;
				}
				waterC.put(i+"-"+j, water);
				water=0;
			}
		}
		System.out.println(waterC);
	}
}
