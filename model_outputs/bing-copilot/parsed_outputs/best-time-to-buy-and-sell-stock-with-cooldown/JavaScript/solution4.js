var maxProfit = function(prices) {
    const stack = [];
    let profit = 0;
    
    for (const price of prices) {
        while (stack.length && price > stack[stack.length - 1]) {
            profit += price - stack.pop();
        }
        stack.push(price);
    }
    
    return profit;
};
