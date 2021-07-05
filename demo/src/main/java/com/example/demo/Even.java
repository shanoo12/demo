package com.example.demo;

public class Even {
	public static void main(String[] args) {
		int a[]= {3,4,1,8,2,10,9};
		int evenCounter=0;int temp=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0&&evenCounter<a.length)
			{
				temp=a[evenCounter];
				a[evenCounter]=a[i];
				a[i]=temp;
				evenCounter+=2;
			}
		}
		for(int e:a)
		{
			System.out.print(e+",");
		}
	}
}
