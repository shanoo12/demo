package com.example.demo;

public class MinMaxShort {
	public static void main(String[] args) {
		int [] a= {1,2,3,4,5,6,7,8};
		int [] b=new int[a.length]; 
		int i=0;int j=a.length-1;int k=0;
		while(i<j)
		{
			b[k++]=a[j--];
			b[k++]=a[i++];
		}
		for(int t:b)
		{
			System.out.print(t+" ");
		}
	}
}
