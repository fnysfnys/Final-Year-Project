public int maxProfit(int[] prices) {
    int sold = 0, held = Integer.MIN_VALUE, reset = 0;
    for (int price : prices) {
        int preSold = sold;
        sold = held + price;
        held =

Math.max(held, reset - price);
        reset = Math.max(reset, preSold);
    }
    return Math.max(sold, reset);
}
