public boolean canCross(int[] stones) {
  return canCrossHelper(stones, 0, 1);
}

private boolean canCrossHelper(int[] stones, int index, int lastJump) {
  if (index == stones.length - 1) {
    return true;
  }
  if (index < 0 || stones[index] < stones[0]) {
    return false;
  }
  for (int jump = lastJump - 1; jump <= lastJump + 1; jump++) {
    if (jump > 0 && index + jump < stones.length && stones[index + jump] > stones[index]) {
      if (canCrossHelper(stones, index + jump, jump)) {
        return true;
      }
    }
  }
  return false;
}
