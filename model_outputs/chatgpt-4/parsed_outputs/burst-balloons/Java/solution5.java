class Solution {
    public int maxCoins(int[] nums) {
           int n = nums.length;
           int[] newNums = new int[n + 2];
           System.arraycopy(nums, 0, newNums, 1, n);
           newNums[0] = newNums[n + 1] = 1;
    
           int[][] dp = new int[n + 1][n + 1];
           for (int len = 1; len <= n; len++) {
               for (int left = 1; left <= n - len + 1; left++) {
                   int right = left + len - 1;
                   for (int i = left; i <= right; i++) {
                       int leftValue = left == i ? 0 : dp[left][i - 1];
                       int rightValue = right == i ? 0 : dp[i + 1][right];
                       dp[left][right] = Math.max(dp[left][right], 
                                                  newNums[left - 1] * newNums[i] * newNums[right + 1] 
                                                  + leftValue + rightValue);
                   }
               }
           }
           return dp[1][n];
       }
}
