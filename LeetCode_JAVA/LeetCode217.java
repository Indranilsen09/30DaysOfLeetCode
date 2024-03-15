package LeetCode_JAVA;

import java.util.HashSet;
import java.util.Set;

public class LeetCode217 
{
	//217. Contains Duplicate
	//-----------------------------------------------------------------------
	/* Given an integer array nums, 
	 * return true if any value appears at least twice in the array,
	 * and return false if every element is distinct. 
	 * ----------------------------------------------------------------------
	 */
	
	 public boolean containsDuplicate(int[] nums) 
	    {
	       Set<Integer> unique = new HashSet<Integer>();
	       for(int i=0;i<nums.length;i++) 
	       {
	           if(unique.contains(nums[i]))
	           {
	               return true;
	           }
	           unique.add(nums[i]);
	       }   
	       return false;
	    }
}
