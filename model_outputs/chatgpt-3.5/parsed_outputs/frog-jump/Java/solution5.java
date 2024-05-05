class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        Map<Integer, Set<Integer>> jumpMap = new HashMap<>();
        
        for (int stone : stones) {
            jumpMap.put(stone, new HashSet<>());
        }
        
        jumpMap.get(0).add(0);
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        
        while (!stack.isEmpty()) {
            int currentStone = stack.pop();
            int currentJump = jumpMap.get(currentStone).iterator().next();
            
            for (int nextJump = currentJump - 1; nextJump <= currentJump + 1; nextJump++) {
                if (nextJump > 0) {
                    int nextStone = currentStone + nextJump;
                    if (jumpMap.containsKey(nextStone) && !jumpMap.get(nextStone).contains(nextJump)) {
                        jumpMap.get(nextStone).add(nextJump);
                        stack.push(nextStone);
                    }
                }
            }
        }
        
        return !jumpMap.get(stones[n - 1]).isEmpty();
    }
}
