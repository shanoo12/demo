package com.example.demo;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		int a[]= {1,2,8,9};
		int b[]= {3,5,8,9};
		int total=a.length+b.length;
		int c[]=new int [total];
		int l=0;int r=0;
		boolean compare=true;
		for(int i=0;i<=total-1;)
		{
				if(a[l]<=b[r])
				{
					c[i]=a[l];
					l++;
					i++;
					if(l==a.length)
					{
						while(r<=b.length-1)
						{
							c[i]=b[r];
							r++;
							i++;
							
						}
					}
					
					
				}else if(a[l]>b[r])
				{
					c[i]=b[r];
					r++;
					i++;
					if(r==b.length)
					{
						while(l<=a.length-1)
						{
							c[i]=a[l];
							l++;
							i++;
						}
					}
					
				}
				
				
		}
		int t=c.length/2;
		if(c.length%2==0)
		{
			
			double d=((double)c[t]+(double)c[t-1])/2;
			System.out.println(d);
		}else
			System.out.println(c[t]);
	}
}
