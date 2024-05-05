class Solution {
    public int maxProfit(int[] prices) {
        return maxProfitHelper(prices, 0, prices.length - 1);
    }

    private int maxProfitHelper(int[] prices, int start, int end) {
        if (end <= start)
            return 0;

        int profit = 0;
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (prices[j] > prices[i]) {
                    int currProfit = prices[j] - prices[i] +
                            maxProfitHelper(prices, start, i - 1) +
                            maxProfitHelper(prices, j + 1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }
        return profit;
    }
}
