var maxProfit = function(prices) {
    const stack = [];
    let profit = 0;
    
    for (let i = 0; i < prices.length; i++) {
        while (stack.length > 0 && prices[i] > stack[stack.length - 1]) {
            profit += prices[i] - stack.pop();
        }
        stack.push(prices[i]);
    }
    
    return profit;
};