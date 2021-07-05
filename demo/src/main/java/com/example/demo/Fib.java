package com.example.demo;

public class Fib {
	int given =9;
		public static void main(String[] args) {
			
			System.out.println(getFib(9));
		}
		
		private static int getFib(int first) {
			int sum=0;
			if(first<=2)
			{
				return 1;
			}else
			{
				sum=getFib(first-1)+getFib(first-2);
				//System.out.println(sum);
				return sum;
			}
		}
}
