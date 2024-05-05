class Solution {
    public boolean canCross(int[] stones) {
       int[] sortedStones = Arrays.copyOf(stones, stones.length);
       Arrays.sort(sortedStones);
       for (int i = 0; i < sortedStones.length - 1; i++) {
           if (sortedStones[i] + 1 == sortedStones[i + 1]) {
               return true;
           }
       }
       return false;
    }
    
}
