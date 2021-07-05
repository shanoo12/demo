package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombineSum {

public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> combinations =new ArrayList<>();
        if(candidates==null||candidates.length==0)
		{
			return result;
		}
        Arrays.sort(candidates);
        findAllCombination(result,combinations ,candidates,target,0);
        return result;
    }

private void findAllCombination(List<List<Integer>> result, List<Integer> combinations, int[] candidates, int target,
		int start) {
		if(target==0)
		{
			result.add(new ArrayList<>(combinations));
		}
			
			for(int i=start;i<candidates.length;i++)
			{
				if(candidates[i]>target)
				{
					break;
				}
				combinations.add(candidates[i]);
				findAllCombination(result, combinations, candidates, target-candidates[i], i);
				combinations.remove(combinations.size()-1);
			}
	
}
}
