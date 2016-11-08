public class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
        if(s.length()==0)return true;
        int count=0;
      StringBuilder t1= new StringBuilder(t);
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<t1.length();j++) {
                if (t1.charAt(j) == '0') continue;
                if (s.charAt(i) == t1.charAt(j)) {
                    t1.setCharAt(j, '0');
                    count++;
                    break;
                }
            }
        }
        return count==t1.length()?true:false;
}}