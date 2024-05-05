class Solution {
       /**
        * (Docstring as provided)
        */
       public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
           int[][] dp = new int[buckets + 1][buckets + 1];
           dp[0][0] = 1;
           for (int i = 1; i <= buckets; i++) {
               dp[i][0] = 1;
               for (int j = 1; j <= i; j++) {
                   dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                   if (dp[i][j] >= buckets) {
                       return i;
                   }
               }
           }
           return buckets;
       }
   }