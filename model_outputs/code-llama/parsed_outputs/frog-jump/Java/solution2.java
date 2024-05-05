class Solution {
    public boolean canCross(int[] stones) {
       for (int i = 0; i < stones.length - 1; i++) {
           int lastStone = stones[stones.length - 1];
           for (int j = 0; j < stones.length - 1; j++) {
               if (stones[j] + 1 == lastStone) {
                   return true;
               }
           }
       }
       return false;
    }
    
}
