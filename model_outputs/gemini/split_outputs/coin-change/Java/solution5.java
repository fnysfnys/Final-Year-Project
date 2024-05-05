public int coinChange(int[] coins, int amount) {
  List<Integer> combinations = new ArrayList<>();
  int minCoins = Integer.MAX_VALUE;
  coinChangeHelper(coins, amount, 0, new ArrayList<>(), combinations, minCoins);
  return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
}

private void coinChangeHelper(int[] coins, int amount, int currentSum, List<Integer> current, List<Integer> combinations, int minCoins) {
  if (currentSum == amount) {
    minCoins = Math.min(minCoins, current.size());
    combinations.add(new ArrayList<>(current));
    return;
  }
  if (currentSum > amount || current.size() >= minCoins) return;
  for (int coin : coins) {
    current.add(coin);
    coinChangeHelper(coins, amount, currentSum + coin, current, combinations, minCoins);
    current.remove(current.size() - 1);
  }
}
