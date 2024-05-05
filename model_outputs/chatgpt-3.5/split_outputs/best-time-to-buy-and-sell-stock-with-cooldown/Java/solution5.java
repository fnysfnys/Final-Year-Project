public int maxProfit(int[] prices) {
    int buy = Integer.MAX_VALUE;
    int maxProfit = 0;
    
    for (int price : prices) {
        if (price < buy) {
            buy = price;
        } else {
            maxProfit += price - buy;
            buy = price;
        }
    }
    
    return maxProfit;
}
