/*Problem : Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice. */

import java.util.*; 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int [] res = new int[2];
        if ( nums == null || nums.length == 0){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        Map<Integer, Integer> ht = new HashMap<Integer, Integer>(); 
        for ( int i = 0; i < nums.length; i++){
                if ( ht.containsKey(target - nums[i])){
                    res[0] = i;
                    res[1] = ht.get(target - nums[i]);
                    break;
                } else {
                    ht.put(nums[i], i);
                }
        }
        return res;
        
    }
}
