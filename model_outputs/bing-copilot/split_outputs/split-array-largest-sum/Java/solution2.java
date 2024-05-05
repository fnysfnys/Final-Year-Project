public int splitArray(int[] nums, int k) {
    int n = nums.length;
    int[][] dp = new int[n + 1][k + 1];
    for (int i = 1; i <= n; i++) {
        dp[i][1] = dp[i - 1][1] + nums[i - 1];
    }
    for (int i = 2; i <= n; i++) {
        for (int j = 2; j <= k; j++) {
            int minSum = Integer.MAX_VALUE;
            for (int x = i - 1; x >= j - 1; x--) {
                int currSum = Math.max(dp[x][j - 1], sum(nums, x, i - 1));
                minSum = Math.min(minSum, currSum);
            }
            dp[i][j] = minSum;
        }
    }
    return dp[n][k];
}
