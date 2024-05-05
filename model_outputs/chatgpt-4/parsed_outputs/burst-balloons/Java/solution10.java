class Solution {
    public int maxCoins(int[] nums) {
            int n = nums.length;
            int[] extendedNums = new int[n + 2];
            extendedNums[0] = extendedNums[n + 1] = 1;
            System.arraycopy(nums, 0, extendedNums, 1, n);
    
            int[][] dp = new int[n + 2][n + 2];
            for (int gap = 2; gap < n + 2; gap++) {
                for (int left = 0; left < n + 2 - gap; left++) {
                    int right = left + gap;
                    for (int i = left + 1; i < right; i++) {
                        dp[left][right] = Math.max(dp[left][right], 
                                                   extendedNums[left] * extendedNums[i] * extendedNums[right] 
                                                   + dp[left][i] + dp[i][right]);
                    }
                }
            }
            return dp[0][n + 1];
        }
}
