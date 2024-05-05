class Solution {
    public boolean canCross(int[] stones) {
        int n = stones.length;
        boolean[][] dp = new boolean[n][n];
        dp[0][0] = true;
    
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                int jump = stones[i] - stones[j];
                if (jump <= j + 1) {
                    dp[i][jump] = dp[j][jump - 1] || dp[j][jump] || dp[j][jump + 1];
                }
            }
        }
    
        for (boolean reachable : dp[n - 1]) {
            if (reachable) {
                return true;
            }
        }
        return false;
    }
    
}
