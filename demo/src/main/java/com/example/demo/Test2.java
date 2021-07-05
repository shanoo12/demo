package com.example.demo;

public class Test2 {
		public static void main(String [] args) {
			int nums[]= {0,1,0,3,12};
			int first=0;
	        
	       
	        for(int i=0;i<nums.length;i++){
	           if(nums[i]!=0)
	        	   nums[first++]=nums[i];
	            
	        }
	        while(first<nums.length)
	        {
	        	nums[first++]=0;
	        }
	        for(int i:nums)
	        	System.out.print(i+",");

		}
}
