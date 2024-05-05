var coinChange = function(coins, amount, memo = {}) {
  if (amount in memo) return memo[amount];
  if (amount === 0) return 0;
  if (amount < 0) return -1;
  let minCoins = Number.MAX_SAFE_INTEGER;
  for (let coin of coins) {
    const remaining = coinChange(coins, amount - coin, memo);
    if (remaining !== -1) {
      minCoins = Math.min(minCoins, remaining + 1);
    }
  }
  memo[amount] = minCoins === Number.MAX_SAFE_INTEGER ? -1 : minCoins;
  return memo[amount];
};
