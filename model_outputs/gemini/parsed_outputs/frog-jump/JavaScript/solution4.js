function canCross(stones) {
  const n = stones.length;
  const dp = new Array(n).fill(null);

  function canJumpFrom(index) {
    if (dp[index] !== null) return dp[index];
    if (index === n - 1) return true;
    for (let j = 0; j < index; j++) {
      const jump = stones[index] - stones[j];
      if (jump > 0 && jump <= j + 1 && canJumpFrom(j)) {
        dp[index] = true;
        return true;
      }
    }
    dp[index] = false;
    return false;
  }

  return canJumpFrom(0);
}
