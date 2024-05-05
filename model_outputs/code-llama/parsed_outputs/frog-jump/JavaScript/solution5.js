function canCross(stones) {
   const lastStone = stones[stones.length - 1];
   for (let i = stones.length - 2; i >= 0; i--) {
       const mid = Math.floor((stones[i] + lastStone) / 2);
       if (stones[i] - mid > 1) {
           return false;
       }
       lastStone = mid;
   }
   return true;
}
