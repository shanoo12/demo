package com.example.demo;

public class MaxShop {
		public static void main(String[] args) {
			int [] a= {8,2,1,1,6,8,9};
			int budget=5;
			int i=0;
			int k=0;
			int tempBudget=budget;
			int intCount=0;
			int finalCount=0;
			int maxCount=0;
			while(i<a.length) {
				finalCount=i;
				if(maxCount<finalCount-intCount+1&&intCount!=finalCount)
					maxCount=finalCount-intCount+1;
				if(tempBudget-a[i]>0)
				{
					tempBudget=tempBudget-a[i];
					
				}else if(tempBudget-a[i]<=0)
				{
					
					tempBudget=budget;
					intCount=i+1 ;
					
				}
				
				i++;
			}
			System.out.println("maxCount"+maxCount);
			
		}
}
