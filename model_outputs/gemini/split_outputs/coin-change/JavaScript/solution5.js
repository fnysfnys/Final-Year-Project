var coinChange = function(coins, amount) {
  const combinations = [];
  const backtrack = (combo, remaining) => {
    if (remaining === 0) {
      combinations.push([...combo]);
      return;
    }
    for (let coin of coins) {
      if (remaining >= coin && (combo.length === 0 || coin >= combo[combo.length - 1])) {
        backtrack([...combo, coin], remaining - coin);
      }
    }
  };
  backtrack([], amount);
  const minCoins = combinations[0]?.length;
  return minCoins === undefined ? -1 : minCoins;
};
