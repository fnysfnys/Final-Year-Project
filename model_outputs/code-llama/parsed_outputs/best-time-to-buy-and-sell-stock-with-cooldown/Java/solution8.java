class Solution {
    public int maxProfit(int[] prices) {
       return maxProfit(prices, 0);
    }
    
    private int maxProfit(int[] prices, int index) {
       if (index >= prices.length) {
           return 0;
       }
       int maxProfit = 0;
       for (int i = index; i < prices.length; i++) {
           maxProfit = Math.max(maxProfit, prices[i] - prices[index]);
       }
       return maxProfit + maxProfit(prices, index + 1);
    }
    
}
