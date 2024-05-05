public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int count = 0;
    
    int[][] dp = new int[n][n];
    
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            long diff = (long) nums[j] - nums[i];
            if (diff <= Integer.MIN_VALUE || diff >= Integer.MAX_VALUE) continue;
            
            int d = (int) diff;
            
            dp[j][d] += 1;
            if (dp[i][d] > 0) {
                dp[j][d] += dp[i][d];
                count += dp[i][d];
            }
        }
    }
    
    return count;
}
