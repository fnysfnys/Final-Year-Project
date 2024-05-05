class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
      int[][] dp = new int[minutesToTest + 1][buckets + 1];
      for (int i = 1; i <= minutesToTest; i++) {
        dp[i][1] = 1;
      }
      for (int i = 2; i <= minutesToTest; i++) {
        for (int j = 2; j <= buckets; j++) {
          int minPigs = Integer.MAX_VALUE;
          for (int k = 1; k < i; k++) {
            minPigs = Math.min(minPigs, 1 + Math.max(dp[i - k][j - 1], dp[k][j]));
          }
          dp[i][j] = minPigs;
        }
      }
      return dp[minutesToTest][buckets];
    }
    
}
