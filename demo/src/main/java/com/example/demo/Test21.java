package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test21 {

public static void main(String[] args) {
	int[] nums= {4,2,4,5,6,8,5,2};
	Set<Integer> unique=new HashSet<Integer>();
    int i=0;int sum=0;int maxSum=0;int j=0;
    while(i<nums.length)
    {
        //unique.add(nums[i]);
        if(unique.add(nums[i])==false||i==nums.length-1)
        {
             System.out.println(unique);
         for(int x:unique)
         {
             sum=sum+x;
            
         }
            j++;
            
            maxSum=Math.max(maxSum,sum);
            sum=0;
         unique.clear();
            i=j;
        }else
                i++;
        }
	System.out.println(maxSum);

}

}
