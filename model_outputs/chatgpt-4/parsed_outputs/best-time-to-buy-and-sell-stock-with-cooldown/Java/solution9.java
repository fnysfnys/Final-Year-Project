class Solution {
    public int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }
    
    private int calculate(int[] prices, int s) {
        if (s >= prices.length) return 0;
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxProfit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 2) + prices[i] - prices[start];
                    maxProfit = Math.max(maxProfit, profit);
                }
            }
            max = Math.max(max, maxProfit);
        }
        return max;
    }
}
