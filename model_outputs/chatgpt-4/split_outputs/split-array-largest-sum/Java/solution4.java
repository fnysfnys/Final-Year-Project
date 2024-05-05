public int splitArray(int[] nums, int k) {
    int n = nums.length;
    int[] prefixSum = new int[n + 1];
    for (int i = 0; i < n; i++) {
        prefixSum[i + 1] = prefixSum[i] + nums[i];
    }
    int[][] dp = new int[n][k + 1];
    for (int i = 0; i < n; i++) {
        Arrays.fill(dp[i], Integer.MAX_VALUE / 2);
        dp[i][1] = prefixSum[i + 1];
    }
    for (int j = 2; j <= k; j++) {
        for (int i = 0; i < n; i++) {
            for (int p = 0;

; p < i; p++) {
                int max = Math.max(dp[p][j - 1], prefixSum[i + 1] - prefixSum[p + 1]);
                dp[i][j] = Math.min(dp[i][j], max);
            }
        }
    }
    return dp[n - 1][k];
}
