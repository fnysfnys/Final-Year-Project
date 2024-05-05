public int maxProfit(int[] prices) {
    int buy = Integer.MIN_VALUE;
    int sell = 0;
    int prevSell = 0;
    
    for (int price : prices) {
        int prevBuy = buy;
        buy = Math.max(buy, prevSell - price);
        prevSell = sell;
        sell = Math.max(sell, prevBuy + price);
    }
    
    return sell;
}
