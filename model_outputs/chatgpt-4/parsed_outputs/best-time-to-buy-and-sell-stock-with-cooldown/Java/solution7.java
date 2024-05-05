class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, i = 0;
        while (i < prices.length) {
            // Find next local minimum
            while (i < prices.length - 1 && prices[i + 1] <= prices[i]) i++;
            int buy = prices[i++]; // Buy at local minimum
    
            // Find next local maximum
            while (i < prices.length - 1 && prices[i + 1] >= prices[i]) i++;
            int sell = i < prices.length ? prices[i++] : 0; // Sell at local maximum
    
            profit += Math.max(0, sell - buy);
        }
        return profit;
    }
}
