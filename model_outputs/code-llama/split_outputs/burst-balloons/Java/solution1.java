public int maxCoins(int[] nums) {
   int n = nums.length;
   int[][] dp = new int[n][n];
   for (int i = 0; i < n; i++) {
       for (int j = 0; j < n; j++) {
           if (i == 0 && j == 0) {
               dp[i][j] = nums[i] * nums[j];
           } else if (i == 0 && j > 0) {
               dp[i][j] = nums[i] * nums[j] + dp[i][j - 1];
           } else if (i > 0 && j == 0) {
               dp[i][j] = nums[i] * nums[j] + dp[i - 1][j];
           } else {
               dp[i][j] = Math.max(nums[i] * nums[j] + dp[i - 1][j], nums[i] * nums[j] + dp[i][j - 1]);
           }
       }
   }
   return dp[n - 1][n - 1];
}
