package com.example.demo;

import java.util.Arrays;

public class SubSeq {
	public static void main(String[] args) {
		int a[]= {1,2,-1,7,1,9,-1,8,9};
		int max[]=new int[a.length];
		int maxSofar=0;
		Arrays.fill(max, 1);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<i;j++) {
				if(a[j]<a[i])
				{
					max[i]=Math.max(max[i], max[j]+1);
				}
			}
			maxSofar=Math.max(maxSofar, max[i]);
		}
		System.out.println("max Sub sequence:"+maxSofar);
	}
	
	
}
