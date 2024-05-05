class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[][] dp = new int[n][k + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i] = i == 0 ? nums[i] : prefixSum[i - 1] + nums[i];
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if (j == 1) {
                    dp[i][j] = prefixSum[i];
                    continue;
                }
                for (int m = 0; m < i; m++) {
                    int currentMax = Math.max(dp[m][j - 1], prefixSum[i] - prefixSum[m]);
                    if (dp[i][j] > currentMax) {
                        dp[i][j] = currentMax;
                    }
                }
            }
        }
        return dp[n - 1][k];
    }
}
