package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
		public static void main(String[] args) {
			List l=new ArrayList();
			l.add(1,10);
			}

		private static int[] getAnswer(List<int[]> data) {
			int [] ansArr=new int[2];
			int apt=0;int bpt=0;
			for(int[]a:data)
			{
				int as=String.valueOf(a[0]).chars().map(Character::getNumericValue).sum();
				int bs=String.valueOf(a[1]).chars().map(Character::getNumericValue).sum();
				if(as>bs)
					apt++;
				else if(as<bs)
					bpt++;
				else 
				{
					apt++;bpt++;
				}
			}
			
			if(apt>bpt)
				ansArr[0]=0;
			else if(apt<bpt)
				ansArr[0]=1;
				else
				ansArr[0]=2;
			ansArr[1]=apt>bpt?apt:bpt;
			if(ansArr[1]==0)
				ansArr[1]=apt;
			
			return ansArr;
		}
		
		
}
