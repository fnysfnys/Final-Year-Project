class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] paddedNums = new int[n + 2];
        paddedNums[0] = 1;
        paddedNums[n + 1] = 1;
        for (int i = 1; i <= n; i++) {
            paddedNums[i] = nums[i - 1];
        }
        int[][] dp = new int[n + 2][n + 2];
        for (int len = 1; len <= n; len++) {
            for (int left = 1; left <= n - len + 1; left++) {
                int right = left + len - 1;
                for (int i = left; i <= right; i++) {
                    int coins = paddedNums[left - 1] * paddedNums[i] * paddedNums[right + 1];
                    coins += dp[left][i - 1] + dp[i + 1][right];
                    dp[left][right] = Math.max(dp[left][right], coins);
                }
            }
        }
        return dp[1][n];
    }
}
