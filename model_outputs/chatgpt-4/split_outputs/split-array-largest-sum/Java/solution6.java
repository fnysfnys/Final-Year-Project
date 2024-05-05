public int splitArray(int[] nums, int k) {
    int n = nums.length;
    int[] prefixSum = new int[n + 1];
    for (int i = 0; i < n; i++) {
        prefixSum[i + 1] = prefixSum[i] + nums[i];
    }
    int[][] dp = new int[n + 1][k + 1];
    for (int[] row : dp) {
        Arrays.fill(row, Integer.MAX_VALUE);
    }
    dp[0][0] = 0;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= k; j++) {
            for (int p = i; p > 0; p--) {
                dp[i][j] = Math.min(dp[i][j], Math.max(dp[p - 1][j - 1], prefixSum[i] - prefixSum[p]));
            }
        }
    }
    return dp[n][k];
}
