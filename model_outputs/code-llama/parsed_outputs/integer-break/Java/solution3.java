class Solution {
    public int integerBreak(int n) {
       int[] dp = new int[n + 1];
       dp[0] = 1;
       for (int i = 1; i <= n; i++) {
           dp[i] = dp[i - 1] * i;
       }
       return dp[n];
    }
    
}
