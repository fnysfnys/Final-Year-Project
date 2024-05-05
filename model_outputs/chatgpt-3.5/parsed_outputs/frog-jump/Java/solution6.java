class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        boolean[][] dp = new boolean[n][n + 1];
        dp[0][1] = true;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int jump = stones[i] - stones[j];
                if (jump <= i && dp[j][jump]) {
                    dp[i][jump] = true;
                    if (jump > 1) dp[i][jump - 1] = true;
                    if (jump < i) dp[i][jump + 1] = true;
                    if (i == n - 1) return true;
                }
            }
        }
        
        return false;
    }
}
