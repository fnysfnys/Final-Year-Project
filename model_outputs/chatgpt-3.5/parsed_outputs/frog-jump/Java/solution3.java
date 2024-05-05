class Solution {
    public boolean canCross(int[] stones) {
        return canCrossHelper(stones, 0, 0, new HashMap<>());
    }
    
    private boolean canCrossHelper(int[] stones, int index, int jump, Map<String, Boolean> memo) {
        if (index == stones.length - 1) {
            return true;
        }
    
        String key = index + ":" + jump;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
    
        for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
            if (nextJump > 0) {
                int nextStone = stones[index] + nextJump;
                int nextIndex = Arrays.binarySearch(stones, nextStone);
                if (nextIndex >= 0 && canCrossHelper(stones, nextIndex, nextJump, memo)) {
                    memo.put(key, true);
                    return true;
                }
            }
        }
    
        memo.put(key, false);
        return false;
    }
}
