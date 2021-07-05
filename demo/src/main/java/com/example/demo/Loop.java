package com.example.demo;

public class Loop {
public static void main(String[] args) {
	int a=5;int temp=0;int count=0;
	int next=1;
	int[] arr=new int[3];
	while(temp<a)
	{
		
		
			arr[0]=temp;arr[1]=temp;arr[2]=temp;
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			
		
			arr[0]=temp;arr[1]=temp;arr[2]=temp+next;
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			
		
			arr[0]=temp;arr[1]=temp+next;arr[2]=temp;
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			
			
			arr[0]=temp+next;arr[1]=temp;arr[2]=temp;
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			
			
			arr[0]=temp+next;arr[1]=temp+next;arr[2]=temp;
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			
		
			arr[0]=temp;arr[1]=temp+next;arr[2]=temp+next;
			System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
		
			if(temp==a-1) {
				arr[0]=temp+next;arr[1]=temp+next;arr[2]=temp+next;
				System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
			}
		
			temp++;
	}
}
}
