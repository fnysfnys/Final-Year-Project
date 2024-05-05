public int maxProfit(int[] prices) {
   Map<Integer, Integer> hash = new HashMap<>();
   for (int i = 0; i < prices.length; i++) {
       hash.put(prices[i], i);
   }
   int maxProfit = 0;
   for (int i = 0; i < prices.length; i++) {
       int price = prices[i];
       int index = hash.get(price);
       if (index > i) {
           maxProfit += prices[index] - price;
       }
   }
   return maxProfit;
}
