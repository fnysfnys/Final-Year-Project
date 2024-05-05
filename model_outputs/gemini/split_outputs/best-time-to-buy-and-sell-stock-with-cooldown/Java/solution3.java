public int maxProfit(int[] prices) {
  enum State {BUY, SELL, COOLDOWN};
  State state = State.BUY;
  int buy = Integer.MAX_VALUE, profit = 0;
  
  for (int price : prices) {
    switch (state) {
      case BUY:
        buy = Math.min(buy, price);
        state = State.COOLDOWN;
        break;
      case SELL:
        profit = Math.max(profit, price - buy);
        buy = Integer.MAX_VALUE;
        state = State.COOLDOWN;
        break;
      case COOLDOWN:
        if (price < buy) {
          buy = price;
          state = State.BUY;
        } else {
          state = State.SELL;
        }
        break;
    }
  }
  
  return profit;
}
