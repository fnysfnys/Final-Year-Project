function canCross(stones) {
  const lastStone = stones[stones.length - 1];
  const cache = {};

  function canJumpFrom(index, prevJump) {
    if (index === stones.length - 1) return true;
    if (cache[`${index}/${prevJump}`] !== undefined) {
      return cache[`${index}/${prevJump}`];
    }
    for (let jump = prevJump - 1; jump <= prevJump + 1; jump++) {
      if (jump > 0 && stones[index] + jump < stones[stones.length - 1] && stones.indexOf(stones[index] + jump) !== -1) {
        cache[`${index}/${prevJump}`] = canJumpFrom(stones.indexOf(stones[index] + jump), jump);
        if (cache[`${index}/${prevJump}`]) {
          return true;
        }
      }
    }
    cache[`${index}/${prevJump}`] = false;
    return false;
  }

  return canJumpFrom(1, 1);
}
