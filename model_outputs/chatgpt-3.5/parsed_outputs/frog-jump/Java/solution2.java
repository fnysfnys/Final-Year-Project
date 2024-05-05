class Solution {
    public boolean canCross(int[] stones) {
        return canCrossHelper(stones, 0, 0);
    }
    
    private boolean canCrossHelper(int[] stones, int index, int jump) {
        if (index == stones.length - 1) {
            return true;
        }
    
        for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
            if (nextJump > 0) {
                int nextStone = stones[index] + nextJump;
                int nextIndex = Arrays.binarySearch(stones, nextStone);
                if (nextIndex >= 0 && canCrossHelper(stones, nextIndex, nextJump)) {
                    return true;
                }
            }
        }
        
        return false;
    }
}
