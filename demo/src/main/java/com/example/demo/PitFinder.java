package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class PitFinder {

	public static void main(String[] args) throws Exception {

		PitFinder pf=new PitFinder();
		int ar[]={0,2,3,4,0,1,8,3,7,7};
		pf.findPitData(ar).forEach(x->{
			System.out.println(x);
		});
	}

	private List<Pit> findPitData(int[] array) throws Exception {
		int i = 0;
		int leftIndex=0;
		int rightIndex=0;
		int deepestpoint=0;
		List<Pit> pits=new ArrayList<Pit>();
		while (i < array.length-1) {
			
			while(i < array.length-1&&array[i]<=array[i+1])
			{
				leftIndex=++i;
				
			}if(leftIndex==array.length-1)
				throw new Exception("No possible valleys");
			while(i < array.length-1&&array[i]>=array[i+1])
			{
				deepestpoint=++i;
				
			}while(i < array.length-1&&array[i]<=array[i+1])
			{
				rightIndex=++i;
				
			}
			
		if(leftIndex!=rightIndex)
		{
			Pit pit=new Pit();
			pit.setLeftIndex(leftIndex);
			pit.setRightIndex(rightIndex);
			pit.setDeepestpoint(deepestpoint);
			pit.setDepth(Math.abs(array[rightIndex]-array[leftIndex]));
			pits.add(pit);
			leftIndex=rightIndex;
		}
			
		
			
		}
		return pits;

	}

}
