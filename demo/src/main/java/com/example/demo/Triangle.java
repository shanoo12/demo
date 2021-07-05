package com.example.demo;

import java.util.Scanner;

public class Triangle {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt();
		for(int i=0;i<testcase;i++)
		{
			int currentMax=0;
			int size=sc.nextInt();
			for(int j=0;j<=size;j++)
			{
				int currentSum=0;int temp=0;
				for(int k=0;k<j;k++)
				{
					temp=sc.nextInt();
					//System.out.println(currentSum);
					currentSum=currentSum+temp;
				}
				if(currentSum>currentMax)
				{
					currentMax=currentSum;
				}
				
				
			}
			System.out.println(currentMax);
		}
	}
}
