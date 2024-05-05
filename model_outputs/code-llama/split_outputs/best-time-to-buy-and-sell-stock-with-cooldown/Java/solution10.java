public int maxProfit(int[] prices) {
   return maxProfit(prices, 0, new int[prices.length]);
}

private int maxProfit(int[] prices, int index, int[] dp) {
   if (index >= prices.length) {
       return 0;
   }
   if (dp[index] != 0) {
       return dp[index];
   }
   int maxProfit = 0;
   for (int i = index; i < prices.length; i++) {
       maxProfit = Math.max(maxProfit, prices[i] - prices[index]);
   }
   dp[index] = maxProfit;
   for (int i = index + 1; i < prices.length; i++) {
       maxProfit += maxProfit(prices, i, dp);
   }
   return maxProfit;
}
