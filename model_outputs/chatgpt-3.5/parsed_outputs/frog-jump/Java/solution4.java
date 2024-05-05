class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        Map<Integer, Set<Integer>> jumpMap = new HashMap<>();
        
        for (int stone : stones) {
            jumpMap.put(stone, new HashSet<>());
        }
        
        jumpMap.get(0).add(0);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        
        while (!queue.isEmpty()) {
            int currentStone = queue.poll();
            int currentJump = jumpMap.get(currentStone).iterator().next();
            
            for (int nextJump = currentJump - 1; nextJump <= currentJump + 1; nextJump++) {
                if (nextJump > 0) {
                    int nextStone = currentStone + nextJump;
                    if (jumpMap.containsKey(nextStone) && !jumpMap.get(nextStone).contains(nextJump)) {
                        jumpMap.get(nextStone).add(nextJump);
                        queue.offer(nextStone);
                    }
                }
            }
        }
        
        return !jumpMap.get(stones[n - 1]).isEmpty();
    }
}
