package com.example.demo;

public class GoScale {
public static void main(String[] args) {
	int[] X= {4,1,1,3,3,6,6};
	for(int i=0;i<X.length;i++)
	{
		if(X[i]<=0)
			continue;
		int index=X[i]-1;
		if(X[index]>0)
		{
			X[i]=X[index];
			X[index]=-1;
			i--;
		}else {
			X[index]--;
			X[i]=0;
		}
	}
	for(int i:X) {
		System.out.print(i+",");
	}
}

}
