function canCross(stones) {
   const lastStone = stones[stones.length - 1];
   for (let i = stones.length - 2; i >= 0; i--) {
       if (stones[i] - lastStone > 1) {
           return false;
       }
       lastStone = stones[i];
   }
   return true;
}
