public boolean canCross(int[] stones) {
  Boolean[] memo = new Boolean[stones.length];
  return canCrossHelper(stones, 0, 0, memo);
}

private boolean canCrossHelper(int[] stones, int index, int lastJump, Boolean[] memo) {
  if (index == stones.length - 1) {
    return true;
  }
  if (index < 0 || stones[index] < stones[0]) {
    return false;
  }
  if (memo[index] != null) {
    return memo[index];
  }
  for (int jump = lastJump - 1; jump <= lastJump + 1; jump++) {
    if (jump > 0 && index + jump < stones.length && stones[index + jump] > stones[index]) {
      if (canCrossHelper(stones, index + jump, jump, memo)) {
        memo[index] = true;
        return true;
      }
    }
  }
  memo[index] = false;
  return false;
}
