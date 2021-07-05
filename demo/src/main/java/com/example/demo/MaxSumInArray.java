package com.example.demo;

public class MaxSumInArray {

	
	public static void main(String[] args) {
		int arr[]= {-1,3,6,3,-8,3};
		
		int preMax=arr[0];
		int overAllMax=-2147483648;
		for(int i=0;i<arr.length;i++)
		{
			preMax=Math.max(arr[i], preMax+arr[i]);
			if(preMax>overAllMax)
			{
				overAllMax=preMax;
			}
		}
		
			System.out.print("overAllMax "+overAllMax);
		
	}
}
