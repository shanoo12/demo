package com.example.demo;

public class Dynamipal {

	public static void main(String[] args) {
		int a[]= {1,7,3,4,8,2,1};
		int leftSums[]=new int[a.length];
		int rightSum[]=new int[a.length];
		
		int lsum=0;int rsum=0;
		for(int i=1;i<a.length;i++ )
		{
			lsum=lsum+a[i-1];
			leftSums[i]=lsum;
			rsum=rsum+a[a.length-i];
			rightSum[a.length-i-1]=rsum;
		}
		
		boolean balance=false;
		for(int i=0;i<leftSums.length;i++)
		{
			if(leftSums[i]==rightSum[i])
			{
				System.out.println("i"+i);
				balance=true;
			}
				
			
		}
		if(balance)
			System.out.println("exist");
		else
			System.out.println("doesnt exists");
		
	}
	
	
}
