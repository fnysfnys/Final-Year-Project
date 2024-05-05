function canCross(stones) {
  const lastStone = stones[stones.length - 1];

  function canJumpFrom(index, prevJump) {
    if (index === stones.length - 1) return true;
    for (let jump = prevJump - 1; jump <= prevJump + 1; jump++) {
      if (jump > 0 && stones[index] + jump < stones[stones.length - 1] && stones.indexOf(stones[index] + jump) !== -1) {
        if (canJumpFrom(stones.indexOf(stones[index] + jump), jump)) {
          return true;
        }
      }
    }
    return false;
  }

  return canJumpFrom(1, 1);
}
