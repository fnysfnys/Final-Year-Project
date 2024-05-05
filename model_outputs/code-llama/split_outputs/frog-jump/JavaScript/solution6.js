function canCross(stones) {
   const mid = Math.floor(stones.length / 2);
   const left = stones.slice(0, mid);
   const right = stones.slice(mid);
   return canCross(left) && canCross(right);
}
