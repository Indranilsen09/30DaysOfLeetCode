package LeetCode_JAVA;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


//380. Insert Delete GetRandom O(1)
/*
Implement the RandomizedSet class:
RandomizedSet() Initializes the RandomizedSet object.
boolean insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
boolean remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). 
*/


class LeetCode380 {

    static Set<Integer> set;
    static int idx =0;
    Random random;
    
    public LeetCode380() 
    {
       set = new HashSet<Integer>();
       random = new Random();
    }
    
    public boolean insert(int val) 
    {
      if(set.contains(val)) 
        {
    		return false;
    		
    	}else {
    		set.add(val);
    	}
        return true;
    }
    
    public boolean remove(int val) 
    {
     if(set.contains(val)) 
    	{

    		set.remove(val);
    		return true;
    	}
    	return false;
    	   
    }
    
    public int getRandom() 
    {
    	 int n = random.nextInt(set.size());
    	for(int i: set){
            if(n==idx)return i;
            idx++;
        }
    	
    	 return 0;
    }
}
