var coinChange = function(coins, amount) {
  coins.sort((a, b) => b - a); // sort in descending order
  let count = 0;
  while (amount > 0) {
    for (let coin of coins) {
      if (coin <= amount) {
        count += Math.floor(amount / coin);
        amount %= coin;
        break;
      }
    }
    if (amount === 0) {
      return count;
    } else {
      return -1;
    }
  }
};
