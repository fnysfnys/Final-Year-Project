public int numDistinct(String s, String t) {
   int[] dp = new int[s.length() + 1];
   for (int i = 0; i < s.length(); i++) {
       dp[i] = 1;
   }
   for (int i = 1; i < s.length(); i++) {
       for (int j = 0; j < t.length(); j++) {
           if (s.charAt(i) == t.charAt(j)) {
               dp[i] += dp[i - 1];
           }
       }
   }
   return dp[s.length()];
}
