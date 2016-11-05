public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++)
        {
            if(target!=0&&numbers[i]==0)continue;
            for(int j=i+1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target)
                {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return null;
    }
}