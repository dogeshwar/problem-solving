package array.easy.pair;

import java.util.HashMap;
/*
Given an array of integers nums.
A pair (i,j) is called good if nums[i] == nums[j] and i < j.
Return the number of good pairs.
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
* */
public class NumberofGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        if(nums == null) return 0;
        int ans = 0;
        HashMap<Integer, Integer> container = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(container.containsKey(nums[i])){
                ans += container.get(nums[i]);
                container.put(nums[i], (container.get(nums[i])+1));

            }else{
                container.put(nums[i], 1);
            }
        }
        return ans;

    }
}
