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
   int[] dp = new int[s.length() + 1];
   for (int i = 0; i < s.length(); i++) {
       dp[i] = 1;
   }
   for (int i = 1; i < s.length(); i++) {
       for (int j = 0; j < t.length(); j++) {
           if (map.containsKey(t.charAt(j))) {
               dp[i] += dp[i - 1];
           }
       }
   }
   return dp[s.length()];
}
