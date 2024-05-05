function canCross(stones) {
   const sortedStones = stones.slice().sort((a, b) => a - b);
   const lastStone = sortedStones[sortedStones.length - 1];
   for (let i = sortedStones.length - 2; i >= 0; i--) {
       if (sortedStones[i] - lastStone > 1) {
           return false;
       }
       lastStone = sortedStones[i];
   }
   return true;
}
