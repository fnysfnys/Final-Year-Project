var maxProfit = function(prices) {
  let maxProfit = 0;
  
  for (let i = 0; i < prices.length - 1; i++) {
    for (let j = i + 2; j < prices.length; j++) {
      const profit = prices[j] - prices[i];
      maxProfit = Math.max(maxProfit, profit);
    }
  }
  
  return maxProfit;
};
