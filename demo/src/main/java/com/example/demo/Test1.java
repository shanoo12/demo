package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
	
public static void main(String[] args) {
	System.out.println("check happy"+checkHappy(19));
}
static int getPower(int a) {
	
	int sum=0;
	while(a!=0) {
		
		
		sum+=Math.pow(a%10, 2);
		a=a/10;
	}
	return sum;
}

static boolean checkHappy(int x) {
	
	Set<Integer> repeatList=new HashSet<Integer>();
	while(true) {
		if(x==1)
		return true;
		x=getPower(x);
		if(repeatList.contains(x)==true)
			return false;
		repeatList.add(x);
	}
	
}

}
