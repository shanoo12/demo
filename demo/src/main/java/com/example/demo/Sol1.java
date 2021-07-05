package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sol1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		List<Integer> l=new ArrayList<Integer>();
		for(int x=0;x<a;x++) {
			int  n=sc.nextInt();
			int car[]=new int[n];
			//String s[]= sc.nextLine().split(" ");
			for(int i =0 ;i < n;i++){
			    car[i]= sc.nextInt();
			}
			
			l.add(findCount(car));
		}
		for(int d:l)
		{
			System.out.println(d);
		}
	}

	private static int findCount(int[] car) {
		//System.out.println(car[0]);
		int currentMax=car[0];
		int count=0;
		for(int  i=0;i<car.length;i++)
		{
			if(car[i]<=currentMax)
			{
				count++;
				currentMax=car[i];
			}
		}
		
		return count;
		
	}
}
