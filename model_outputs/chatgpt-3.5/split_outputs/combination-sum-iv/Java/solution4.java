public int combinationSum4(int[] nums, int target) {
    int[][] dp = new int[nums.length + 1][target + 1];
    dp[0][0] = 1;
    
    for (int i = 1; i <= nums.length; i++) {
        for (int j = 0; j <= target; j++) {
            for (int k = 0; k * nums[i - 1] <= j; k++) {
                dp[i][j] += dp[i - 1][j - k * nums[i - 1]];
            }
        }
    }
    
    return dp[nums.length][target];
}
