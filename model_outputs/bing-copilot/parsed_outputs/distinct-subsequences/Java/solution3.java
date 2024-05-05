class Solution {
    public int numDistinct(String s, String t) {
           if (t.isEmpty())
               return 1;
           if (s.isEmpty())
               return 0;
           int count = 0;
           if (s.charAt(0) == t.charAt(0))
               count += numDistinct(s.substring(1), t.substring(1));
           count += numDistinct(s.substring(1), t);
           return count;
       }
       
}
