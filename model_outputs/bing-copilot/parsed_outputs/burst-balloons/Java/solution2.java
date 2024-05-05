class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                int end = start + len - 1;
                for (int i = start; i <= end; i++) {
                    int left = (start == 0) ? 1 : nums[start - 1];
                    int right = (end == n - 1) ? 1 : nums[end + 1];
                    int coins = left * nums[i] * right;
                    dp[start][end] = Math.max(dp[start][end], coins + ((i > start) ? dp[start][i - 1] : 0) + ((i < end) ? dp[i + 1][end] : 0));
                }
            }
        }
        return dp[0][n - 1];
    }
}
