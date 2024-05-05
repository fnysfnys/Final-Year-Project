class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
    
        int n = prices.length;
        int[] dp = new int[n + 2]; // Array to store the maximum profit
    
        for (int i = n - 1; i >= 0; i--) {
            int c1 = 0;
            for (int sell = i + 1; sell < n; sell++) {
                int profit = prices[sell] - prices[i] + dp[sell + 2];
                c1 = Math.max(c1, profit);
            }
            int c2 = dp[i + 1];
            dp[i] = Math.max(c1, c2);
        }
    
        return dp[0];
    }
}
