package com.example.demo;

public class ArrayFrequency {
public static void main(String[] args) {
	int []v = {5, 2, 1, 1, 5, 6, 1};
	int n = v.length;
	for(int i = 0;i < n;i++) v[(v[i]%n)-1] += n;
	for(int i = 0;i < n;i++){
	    System.out.println(v[(v[i]-1)%n]/n);
	}
}
}
