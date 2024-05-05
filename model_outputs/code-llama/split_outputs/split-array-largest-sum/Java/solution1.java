public int splitArray(int[] nums, int k) {
   int n = nums.length;
   int[][] dp = new int[n][k];
   for (int i = 0; i < n; i++) {
       for (int j = 0; j < k; j++) {
           dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j] + nums[i]);
       }
   }
   return dp[n - 1][k - 1];
}
