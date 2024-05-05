const memo = {};

var maxProfit = function(prices, i, canBuy) {
  const key = `${i}-${canBuy}`;
  if (key in memo) return memo[key];
  
  if (i >= prices.length) return 0;
  
  let profit = 0;
  if (canBuy) {
    profit = Math.max(maxProfit(prices, i + 1, false) - prices[i], maxProfit(prices, i + 1, true));
  } else {
    profit = Math.max(maxProfit(prices, i + 1, true) + prices[i], maxProfit(prices, i + 2, false));
  }
  
  memo[key] = profit;
  return profit;
};

maxProfit = function(prices) {
  return maxProfit(prices, 0, true);
};
