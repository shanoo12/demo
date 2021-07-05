package com.example.demo;

import java.util.LinkedList;

public class MoveZero {
		public static void main(String[] args) {
			int a[]= {1,2,3,5,0,0,0,1,2,0};

			int count=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]!=0) {
					a[count++]=a[i];
				}
			}
			while(count<a.length) {
				a[count++]=0;
			}
			for(int x:a) {
				System.out.println(x);
			}
			
			LinkedList ls;
			
		}
}
