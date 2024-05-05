class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if (n <= 1) return 0;
        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1];
            for (int j = 0; j < i; j++) {
                int profit = prices[i] - prices[j] + (j >= 2 ? dp[j - 2] : 0);
                dp[i] = Math.max(dp[i], profit);
            }
        }
        return dp[n - 1];
    }
}
