function maxProfit(prices) {
 let left = 0;
 let right = prices.length - 1;
 let maxProfit = 0;
 while (left < right) {
   maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
   left++;
   right--;
 }
 return maxProfit;
}
