var maxProfit = function(prices) {
  if (prices.length < 2) return 0;
  
  const buy = new Array(prices.length).fill(Number.POSITIVE_INFINITY);
  const sell = new Array(prices.length).fill(0);
  
  buy[0] = prices[0];
  
  for (let i = 1; i < prices.length; i++) {
    sell[i] = Math.max(sell[i - 1], prices[i] - buy[i - 1]);
    buy[i] = Math.min(buy[i - 1], prices[i] - sell[i - 2]);
  }
  
  return Math.max(...sell);
};
