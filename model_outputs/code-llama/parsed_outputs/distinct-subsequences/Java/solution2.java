class Solution {
    public int numDistinct(String s, String t) {
       Map<Character, Integer> map = new HashMap<>();
       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           if (!map.containsKey(c)) {
               map.put(c, 1);
           } else {
               map.put(c, map.get(c) + 1);
           }
       }
       int count = 0;
       for (int i = 0; i < t.length(); i++) {
           char c = t.charAt(i);
           if (map.containsKey(c)) {
               count++;
           }
       }
       return count;
    }
    
}
