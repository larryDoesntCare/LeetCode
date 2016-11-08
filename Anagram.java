public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        if(s.length()==0)return true;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                if (map.get(t.charAt(i)) > 1) {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                } else {
                    map.remove(t.charAt(i));
                }
            } else return false;

        }
        return true;
}}