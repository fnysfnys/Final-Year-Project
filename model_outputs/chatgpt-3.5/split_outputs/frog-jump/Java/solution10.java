public boolean canCross(int[] stones) {
    int n = stones.length;
    Map<Integer, Set<Integer>> dp = new HashMap<>();
    
    for (int stone : stones) {
        dp.put(stone, new HashSet<>());
    }
    
    dp.get(0).add(0);
    Stack<Integer> stack = new Stack<>();
    stack.push(0);
    
    while (!stack.isEmpty()) {
        int currentStone = stack.pop();
        int currentJump = dp.get(currentStone).iterator().next();
        
        for (int nextJump = currentJump - 1; nextJump <= currentJump + 1; nextJump++) {
            if (nextJump > 0) {
                int nextStone = currentStone + nextJump;
                int nextIndex = Arrays.binarySearch(stones, nextStone);
                if (nextIndex >= 0 && dp.get(stones[nextIndex]).add(nextJump)) {
                    stack.push(stones[nextIndex]);
                }
            }
        }
    }
    
    return !dp.get(stones[n - 1]).isEmpty();
}
