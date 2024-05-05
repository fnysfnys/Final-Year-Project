public int splitArray(int[] nums, int k) {
    int n = nums.length;
    int[][] dp = new int[k + 1][n + 1];
    
    int[] prefixSum = new int[n + 1];
    for (int i = 1; i <= n; i++) {
        prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
    }
    
    for (int i = 1; i <= n; i

++) {
        dp[1][i] = prefixSum[i];
    }
    
    for (int i = 2; i <= k; i++) {
        for (int j = i; j <= n; j++) {
            dp[i][j] = Integer.MAX_VALUE;
            for (int x = i - 1; x < j; x++) {
                dp[i][j] = Math.min(dp[i][j], Math.max(dp[i - 1][x], prefixSum[j] - prefixSum[x]));
            }
        }
    }
    
    return dp[k][n];
}
