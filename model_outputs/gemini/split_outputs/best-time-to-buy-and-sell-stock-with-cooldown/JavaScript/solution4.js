var maxProfit = function(prices) {
  let maxProfit = 0;
  let minPrice = prices[0];
  
  for (let i = 1; i < prices.length; i++) {
    const profit = prices[i] - minPrice;
    maxProfit = Math.max(maxProfit, profit);
    minPrice = Math.min(minPrice, prices[i]);
  }
  
  return maxProfit;
};
