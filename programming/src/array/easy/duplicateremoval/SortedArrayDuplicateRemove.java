package array.easy.duplicateremoval;
/*
*   Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
    Example 1:
    Given nums = [1,1,2],
    Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
    It doesn't matter what you leave beyond the returned length.
*
* */
public class SortedArrayDuplicateRemove {
    public int removeDuplicates(int[] nums) {
        if(nums == null) return 0;
        if(nums.length == 1) return 1;
        int ans=0;
        for(int i=1; i<nums.length; i++){
            if(nums[ans] != nums[i]){
                ans++;
                nums[ans] = nums[i];
            }
        }
        return ans+1;
    }
}
