public class Solution {
    public int removeDuplicates(int[] nums) {
        int leftPointer=0;
        if(nums.length==0||nums==null) return 0;
        if(nums.length==1) return 1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=nums[leftPointer])
            {
                nums[++leftPointer]=nums[i];
            }
        }
        return leftPointer+1;
    }
}