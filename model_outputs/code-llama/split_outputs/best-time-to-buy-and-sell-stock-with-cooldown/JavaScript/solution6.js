function maxProfit(prices) {
 let maxProfit = 0;
 for (let i = 0; i < prices.length; i++) {
   let left = 0;
   let right = prices.length - 1;
   while (left < right) {
     let mid = Math.floor((left + right) / 2);
     if (prices[mid] - prices[i] > maxProfit) {
       maxProfit = prices[mid] - prices[i];
     }
     if (prices[mid] - prices[i] < 0) {
       left = mid + 1;
     } else {
       right = mid - 1;
     }
   }
 }
 return maxProfit;
}
