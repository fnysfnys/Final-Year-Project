function canCross(stones) {
   for (let i = 1; i < stones.length; i++) {
       if (stones[i] - stones[i - 1] > 1) {
           return false;
       }
   }
   return true;
}
