public class Solution {
   public void rotate(int[] nums, int k) {
        int len = nums.length;
        k = k % len;
        //loop 1, reverse the whole array
        for(int i=0;i<len/2;i++){
            int temp = nums[i];
            nums[i] = nums[len-i-1];
            nums[len-i-1] = temp;
        }
        //loop 2, reverse the first k elements
        for(int i=0;i<k/2;i++){
            int temp = nums[i];
            nums[i] = nums[k-i-1];
            nums[k-i-1] = temp;
        }
        //loop 3, reverse the remaining elements
        for(int i=k;i<(k+len)/2;i++){
            int temp = nums[i];
            nums[i] = nums[len-(i-k)-1];
            nums[len-(i-k)-1] = temp;
        }
    }
}