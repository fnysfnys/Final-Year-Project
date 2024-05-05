class Solution {
    public int maxProfit(int[] prices) {
        return maxProfitRecursive(prices, 0, new Integer[prices.length]);
    }
    
    private int maxProfitRecursive(int[] prices, int index, Integer[] memo) {
        if (index >= prices.length) return 0;
        if (memo[index] != null) return memo[index];
    
        int maxProfit = 0;
        for (int i = index; i < prices.length; i++) {
            int max = 0;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    max = Math.max(max, prices[j] - prices[i] + maxProfitRecursive(prices, j + 2, memo));
                }
            }
            maxProfit = Math.max(maxProfit, max);
        }
        memo[index] = maxProfit;
        return maxProfit;
    }
}
