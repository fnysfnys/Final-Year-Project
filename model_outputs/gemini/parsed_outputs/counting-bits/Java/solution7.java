class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];
        int mask = 1;
        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                dp[i] = 1;
            } else {
                dp[i] = dp[i & (i - 1)] + 1;
            }
        }
        return dp;
    }
    
}
