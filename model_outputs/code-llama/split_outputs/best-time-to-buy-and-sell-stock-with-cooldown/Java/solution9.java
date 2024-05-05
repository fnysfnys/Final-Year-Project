public int maxProfit(int[] prices) {
   return maxProfit(prices, 0, prices.length - 1);
}

private int maxProfit(int[] prices, int left, int right) {
   if (left >= right) {
       return 0;
   }
   int mid = (left + right) / 2;
   int leftProfit = maxProfit(prices, left, mid);
   int rightProfit = maxProfit(prices, mid + 1, right);
   int maxProfit = 0;
   for (int i = left; i <= mid; i++) {
       maxProfit = Math.max(maxProfit, prices[i] - prices[left]);
   }
   for (int i = mid + 1; i <= right; i++) {
       maxProfit = Math.max(maxProfit, prices[i] - prices[mid + 1]);
   }
   return leftProfit + rightProfit + maxProfit;
}
