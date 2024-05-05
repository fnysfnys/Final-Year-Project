function canCross(stones) {
   if (stones.length === 1) {
       return true;
   }
   const lastStone = stones[stones.length - 1];
   const previousStone = stones[stones.length - 2];
   if (lastStone - previousStone > 1) {
       return false;
   }
   return canCross(stones.slice(0, -1));
}
