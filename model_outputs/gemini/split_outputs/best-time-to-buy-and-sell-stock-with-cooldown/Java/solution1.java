public int maxProfit(int[] prices) {
  int n = prices.length;
  int buy = Integer.MAX_VALUE, sell = 0, cooldown = 0;
  
  for (int price : prices) {
    buy = Math.min(buy, price);
    cooldown = Math.max(cooldown, sell - price);
    sell = Math.max(sell, price - buy);
  }
  
  return sell;
}
