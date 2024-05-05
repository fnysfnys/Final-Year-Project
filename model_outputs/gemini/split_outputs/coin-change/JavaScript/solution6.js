var coinChange = function(coins, amount) {
  const dp = new Array(amount + 1).fill(0);
  dp[0] = 1; // base case: 1 way to make amount 0 (using no coins)
  for (let coin of coins) {
    for (let i = coin; i <= amount; i++) {
      dp[i] |= dp[i - coin]; // count combinations using current coin or not
    }
  }
  return dp[amount] > 0 ? dp[amount].toString(2).split('1').length - 1 : -1;
};
