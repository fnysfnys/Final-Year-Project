class Solution {
    public boolean canCross(int[] stones) {
       if (stones.length == 0) {
           return false;
       }
       if (stones.length == 1) {
           return true;
       }
       int lastStone = stones[stones.length - 1];
       for (int i = 0; i < stones.length - 1; i++) {
           if (stones[i] + 1 == lastStone) {
               return canCross(Arrays.copyOfRange(stones, 0, stones.length - 1));
           }
       }
       return false;
    }
    
}
