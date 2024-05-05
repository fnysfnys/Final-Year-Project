public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int count = 0;
    
    int[][][] dp = new int[n][n][n];
    
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            long diff = (long) nums[j] - nums[i];
            if (diff <= Integer.MIN_VALUE || diff >= Integer.MAX_VALUE) continue;
            
            int d = (int) diff;
            
            dp[j][d][1] += 1;
            for (int k = 0; k < j; k++) {
                dp[j][d][1] += dp[k][d][1];
                dp[j][d][2] += dp[k][d][1];
            }
            count += dp[j][d][2];
        }
    }
    
    return count;
}
