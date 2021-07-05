package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumNumber {
			public static void main(String[] args) {
				int a[]= {1, 0, -1, 0, -2, 2};
				int target=0;
				List<String> hits=new ArrayList<String>();
				Arrays.sort(a);
				for(int i=0;i<a.length-3;i++)
				{
					if(i>0&&a[i]==a[i-1])
					{
						continue;
					}
					for(int j=i+1;j<a.length-2;j++)
					{
						if(j>i+1&&a[j]==a[j-1])
						{
							continue;
						}
						int min=j+1;
						int max=a.length-1;
						int newTarget=target-a[i]-a[j];
						while(min<max)
						{
							if(min>j+1&&a[min]==a[min-1])
							{
								min++;
								continue;
								
							}
							if(max<a.length-1&&a[max]==a[max+1])
							{
								max++;
								continue;
								
							}
							int sum=a[max]+a[min];
							if(sum<newTarget)
							{
								min++;
							}else if(sum>newTarget)
							{
								max--;
							}else
							{
								hits.add(a[i]+","+a[j]+","+a[max]+","+a[min]);
								min++;
								max--;
							}
							
							
							
						}
						
					}
				}
				hits.forEach(x->System.out.println(x));
			}
}
