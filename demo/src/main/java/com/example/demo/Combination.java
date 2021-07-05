package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination {

	public static void main(String[] args) {
		String a="56565989";
		
		System.out.println(comb(a));
		
	}
	static List<String> comb(String a)
	{
		List<String> total=new ArrayList<String>();
		if(a.isEmpty())
        {
            
            return total;
        }
		if(a.length()==1)
		{
			total.addAll(Arrays.asList(combination(Integer.parseInt(a))));
			return total;
		}else
		{
			String next=a.substring(1);
			String pre=Character.toString(a.charAt(0));
			List <String>temp=comb(next);
			for(String t:temp)
			{
				for(String j:combination(Integer.parseInt(pre)))
				{
					total.add(j+t);
				}
			}
		}
		
		
		
		
		
		return total;
	}
	static String[] combination(int a)
	{
		
		switch (a)
		{
		case 2:
			return	new String[] {"a","b","c"};
					
		case 3:
			return new String[]{"d","e","f"};
		case 4:
			return new String[] {"g","h","i"};
		case 5:
			return new String [] {"j","k","l"};
		case 6:
			return new String[] {"m","n","o"};
		case 7:
			return new String[] {"p","q","r","s"};
		case 8:
			return  new String[] {"t","u","v"};
		case 9:
			return new String[] {"w","x","y","z"};
		default:
			return new String[] {};
		}
	}
}
