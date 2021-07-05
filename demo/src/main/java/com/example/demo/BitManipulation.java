package com.example.demo;

public class BitManipulation {
			public static void main(String[] args) {
				boolean ans=false;
				int n=20;
				int c=0;
				for(int mask = 0; mask < (1 << n); mask++) {
					 long sum_of_this_subset = 0;
					 c=0;
					for(int i = 0; i < n; i++) {
						if((mask & (1 << i))!=0) {
							sum_of_this_subset += i;
							System.out.println("test:"+i);
						}
						c++;
					}
					
					
					if(sum_of_this_subset == 5) {
						ans=true;
						
					}
					
				}
				
				System.out.println("ans:"+ans);
			}
}
