package com.example.demo;

public class LockDemo {
	
	public static void main(String[] args) {
		//LockDemo ld=new LockDemo();
		boolean [] lock=new boolean[100];
		/*
		 * for(int i=0;i<lock.length;i++) lock[i]=true;
		 */
		for(int i=1;i<=lock.length;i++)
		{
			for(int j=1;i*j<=100;j++)
			{
				if(lock[(i-1)*(j-1)]==true)
					lock[(i-1)*(j-1)]=false;
				else
					lock[(i-1)*(j-1)]=true;
					
			}
		}
		int count=0;
		for(int i=0;i<lock.length;i++) 
		{
			if(lock[i]==true)
			{
				System.out.println(i);
				count++;
			}
			
				
		}
		System.out.println("count"+count);
			
	}

}
