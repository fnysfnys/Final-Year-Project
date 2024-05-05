class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[] preSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dp[0][0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                for (int p = 0; p < i; p++) {
                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[p][j - 1], preSum[i] - preSum[p]));
                }
            }
        }
        return dp[n][k];
    }
}
