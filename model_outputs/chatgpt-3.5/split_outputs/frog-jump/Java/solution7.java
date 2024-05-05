public boolean canCross(int[] stones) {
    int n = stones.length;
    Map<Integer, Integer> stoneToIndex = new HashMap<>();
    for (int i = 0; i < n; i++) {
        stoneToIndex.put(stones[i], i);
    }
    
    boolean[][] dp = new boolean[n][n + 1];
    dp[0][1] = true;
    
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            int jump = stones[i] - stones[j];
            if (jump <= i && stoneToIndex.containsKey(stones[j] - jump) && dp[j][jump]) {
                dp[i][jump] = true;
                if (jump > 1) dp[i][jump - 1] = true;
                if (jump < i) dp[i][jump + 1] = true;
                if (i == n - 1) return true;
            }
        }
    }
    
    return false;
}
