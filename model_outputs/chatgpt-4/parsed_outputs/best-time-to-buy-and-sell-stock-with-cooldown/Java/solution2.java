class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
    
        int buy = -prices[0], sell = 0, prev_sell = 0;
        for (int price : prices) {
            int temp = sell;
            sell = Math.max(sell, buy + price);
            buy = Math.max(buy, prev_sell - price);
            prev_sell = temp;
        }
        return sell;
    }
}
