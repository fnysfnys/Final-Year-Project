class Solution {
    public int maxCoins(int[] nums) {
           int n = nums.length;
           int[] extendedNums = new int[n + 2];
           extendedNums[0] = extendedNums[n + 1] = 1;
           for (int i = 1; i <= n; i++) {
               extendedNums[i] = nums[i - 1];
           }
    
           int[][] dp = new int[n + 2][n + 2];
           for (int length = 2; length <= n + 1; length++) {
               for (int left = 0; left <= n + 1 - length; left++) {
                   int right = left + length;
                   for (int i = left + 1; i < right; i++) {
                       int coins = extendedNums[left] * extendedNums[i] * extendedNums[right] 
                                   + dp[left][i] + dp[i][right];
                       dp[left][right] = Math.max(dp[left][right], coins);
                   }
               }
           }
           return dp[0][n + 1];
       }
}
