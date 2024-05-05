public int maxProfit(int[] prices) {
   int maxProfit = 0;
   for (int i = 0, j = 1; j < prices.length; j++) {
       if (prices[j] > prices[i]) {
           maxProfit += prices[j] - prices[i];
           i = j;
       }
   }
   return maxProfit;
}
