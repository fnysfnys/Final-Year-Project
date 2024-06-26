public int maxProfit(int[] prices) {
   Arrays.sort(prices);
   int maxProfit = 0;
   for (int i = 0; i < prices.length - 1; i++) {
       maxProfit += prices[i + 1] - prices[i];
   }
   return maxProfit;
}
