public boolean canCross(int[] stones) {
   int lastStone = stones[stones.length - 1];
   for (int i = 0; i < stones.length - 1; i++) {
       if (stones[i] + 1 == lastStone) {
           return true;
       }
   }
   return false;
}
