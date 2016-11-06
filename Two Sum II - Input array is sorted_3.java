public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length-1;
        while(numbers[left]+numbers[right]!=target&&left<right)
        {
            if(numbers[left]+numbers[right]>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        if(left>=right)
        {
            return null;
        }
        else{
            return new int[]{left+1,right+1};
        }
    }
}