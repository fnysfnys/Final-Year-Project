class Solution {
    public int maxProfit(int[] prices) {
      int n = prices.length;
      int[][] memo = new int[n][3]; // 0: buy, 1: sell, 2: cooldown
      return helper(prices, 0, 0, memo);
    }
    
    private int helper(int[] prices, int i, int state, int[][] memo) {
      if (i >= prices.length || memo[i][state] != 0) {
        return memo[i][state];
      }
      
      int buy = Integer.MIN_VALUE, sell = Integer.MIN_VALUE, cooldown = Integer.MIN_VALUE;
      
      if (state == 0) {
        buy = -prices[i];
        cooldown = helper(prices, i + 1, 2, memo);
      } else if (state == 1) {
        sell = prices[i] + helper(prices, i + 1, 0, memo);
        cooldown = helper(prices, i + 1, 2, memo);
      } else {
        sell = prices[i] + helper(prices, i + 2, 0, memo);
        cooldown = helper(prices, i + 1, 2, memo);
      }
      
      memo[i][state] = Math.max(buy, Math.max(sell, cooldown));
      return memo[i][state];
    }
    
}
