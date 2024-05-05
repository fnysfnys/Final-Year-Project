var maxProfit = function(prices) {
  if (prices.length < 2) return 0;
  
  const buy = [prices[0], Number.POSITIVE_INFINITY];
  const sell = [0, 0];
  
  for (let i = 1; i < prices.length; i++) {
    buy[0] = Math.min(buy[0], prices[i] - sell[1]);
    sell[0] = Math.max(sell[0], prices[i] - buy[1]);
    buy[1] = buy[0];
    sell[1] = sell[0];
  }
  
  return Math.max(...sell);
};
