package com.example.demo;
import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MinStack {
	public static void main(String[] args) throws IOException{
		final InputStreamReader reader=new InputStreamReader(System.in);
		final BufferedReader keyboard=new BufferedReader(reader);
		String[] destination =new String[2];
		int[] weight=new int[3];
		int[] totalWeightPerDesitantion=new int[2];
		for(int i=0;i<2;i++) {
			System.out.println("type in the destination");
			destination[i]=keyboard.readLine();
			for(int j=0;j<3;j++) {
				System.out.println("Type in the weight");
				String tInput=keyboard.readLine();
				weight[j]=new Integer (tInput).intValue();
			}
			for(int x=0;x<3;x++) {
				totalWeightPerDesitantion[i]=totalWeightPerDesitantion[i]+weight[x];
				
			}
		}
		int i=0;
		for(String destname:destination)
		{
			
			System.out.println("for destination"+destname+"total weight = "+totalWeightPerDesitantion[i]);
			i++;
		}
	}
}
