package com.example.demo;

public class Solution3 {

	public static void main(String[] args) {
		int ans=0;
		for(int i=0;i<=9;i++)
		{
			for(int j=0;j<=9;j++)
			{
				for(int k=0;k<=9;k++)
				{
					for(int l=0;l<=9;l++)
					{
						if(i==j||j==k||k==l||l==i||i==k||j==l)
							continue;
						int z=(i*1000)+(j*100)+(k*10)+l;
						int y=(l*1000)+(k*100)+(j*10)+i;
						if(z==4*y)
						{
							ans=z;
							System.out.println("ans"+ans);
						}
					}
				}
			}
		}
			
			
	}

}
