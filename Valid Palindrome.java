public class Solution {
    public boolean isPalindrome(String s) {
        
        if(s==null)return false;
        String a=s.toLowerCase();
        int left=0,right=a.length()-1;
        while(left<right)
        {
            while(!Character.isLetterOrDigit(a.charAt(left))&&left<right)left++;
            while(!Character.isLetterOrDigit(a.charAt(right))&&left<right)right--;
            if(a.charAt(left)!=a.charAt(right)||left>right) return false;
            left++;
            right--;
        }
        return true;
    }
}