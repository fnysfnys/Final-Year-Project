public boolean canCross(int[] stones) {
    int n = stones.length;
    Map<Integer, Set<Integer>> dp = new HashMap<>();
    
    for (int stone : stones) {
        dp.put(stone, new HashSet<>());
    }
    
    dp.get(0).add(0);
    
    for (int i = 0; i < n; i++) {
        int stone = stones[i];
        for (int jump : dp.get(stone)) {
            for (int nextJump = jump - 1; nextJump <= jump + 1; nextJump++) {
                if (nextJump > 0) {
                    int nextStone = stone + nextJump;
                    int nextIndex = Arrays.binarySearch(stones, nextStone);
                    if (nextIndex >= 0) {
                        dp.get(stones[nextIndex]).add(nextJump);
                    }
                }
            }
        }
    }
    
    return !dp.get(stones[n - 1]).isEmpty();
}
