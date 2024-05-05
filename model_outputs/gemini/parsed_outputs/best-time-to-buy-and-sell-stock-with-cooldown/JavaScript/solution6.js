var maxProfit = function(prices) {
  const stack = [];
  let profit = 0;
  
  for (const price of prices) {
    if (stack.length === 0 || price > stack[stack.length - 1]) {
      stack.push(price);
    } else if (price < stack[stack.length - 1]) {
      const minPrice = stack.pop();
      profit += stack[stack.length - 1] - minPrice;
    }
  }
  
  return profit;
};
