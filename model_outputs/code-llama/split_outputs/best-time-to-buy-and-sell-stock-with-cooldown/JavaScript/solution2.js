function maxProfit(prices) {
 let dp = Array(prices.length).fill(0);
 for (let i = 1; i < prices.length; i++) {
   dp[i] = Math.max(dp[i - 1], prices[i] - prices[i - 1]);
 }
 return dp[prices.length - 1];
}
