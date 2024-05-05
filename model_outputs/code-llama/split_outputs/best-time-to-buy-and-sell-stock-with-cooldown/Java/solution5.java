public int maxProfit(int[] prices) {
   int maxProfit = 0;
   for (int i = 0; i < prices.length; i++) {
       int left = prices[i];
       int right = prices[prices.length - 1];
       while (left <= right) {
           int mid = (left + right) / 2;
           if (prices[mid] > prices[i]) {
               maxProfit += prices[mid] - prices[i];
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }
   }
   return maxProfit;
}
