   public int numDistinct(String s, String t) {
       if (s == null || t == null || t.length() == 0)
           return 0;
       int[] dp = new int[t.length()];
       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           for (int j = dp.length - 1; j >= 0; j--) {
               if (c == t.charAt(j)) {
                   dp[j] = dp[j] + (j != 0 ? dp[j - 1] : 1);
               }
           }
       }
       return dp[t.length() - 1];
   }
   