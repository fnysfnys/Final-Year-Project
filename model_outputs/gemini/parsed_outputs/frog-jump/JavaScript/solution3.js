function canCross(stones) {
  const n = stones.length;
  const dp = new Array(n + 1).fill(false);
  dp[0] = true;

  for (let i = 1; i < n; i++) {
    for (let j = 0; j < i; j++) {
      const jump = stones[i] - stones[j];
      if (jump > 0 && jump <= j + 1 && dp[j]) {
        dp[i] = true;
        break;
      }
    }
  }

  return dp[n - 1];
}
