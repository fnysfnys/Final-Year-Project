class Solution {
    public boolean canCross(int[] stones) {
       Map<Integer, Boolean> memo = new HashMap<>();
       return canCross(stones, 0, memo);
    }
    
    private boolean canCross(int[] stones, int index, Map<Integer, Boolean> memo) {
       if (index == stones.length - 1) {
           return true;
       }
       if (memo.containsKey(index)) {
           return memo.get(index);
       }
       for (int i = index + 1; i < stones.length; i++) {
           if (stones[i] - stones[index] <= 1) {
               memo.put(index, true);
               return true;
           }
       }
       memo.put(index, false);
       return false;
    }
    
}
