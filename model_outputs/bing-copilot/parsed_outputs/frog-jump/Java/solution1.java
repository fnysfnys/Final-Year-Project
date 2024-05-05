class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        Map<Integer, Set<Integer>> memo = new HashMap<>();
        return canCrossHelper(stones, 0, 0, memo);
    }
    
    private boolean canCrossHelper(int[] stones, int pos, int jump, Map<Integer, Set<Integer>> memo) {
        if (pos == stones.length - 1) {
            return true;
        }
        if (memo.containsKey(pos) && memo.get(pos).contains(jump)) {
            return false;
        }
    
        for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
            if (nextJump > 0) {
                int nextPos = Arrays.binarySearch(stones, pos + nextJump);
                if (nextPos >= 0 && canCrossHelper(stones, nextPos, nextJump, memo)) {
                    return true;
                }
            }
        }
    
        memo.computeIfAbsent(pos, k -> new HashSet<>()).add(jump);
        return false;
    }
    
}
