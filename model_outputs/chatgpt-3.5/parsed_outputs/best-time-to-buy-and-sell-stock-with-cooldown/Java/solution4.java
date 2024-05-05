class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] > prices[stack.peek()]) {
                int sell = prices[stack.pop()];
                int buy = stack.isEmpty() ? 0 : prices[stack.pop()];
                maxProfit += sell - buy;
            }
            stack.push(i);
        }
        
        return maxProfit;
    }
}
