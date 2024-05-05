class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[][] dp = new int[k + 1][n + 1];
        
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                int min = Integer.MAX_VALUE;
                for (int l = 1; l < j; l++) {
                    min = Math.min(min, Math.max(dp[i - 1][l], sum(nums, l, j)));
                }
                dp[i][j] = min;
            }
        }
        
        return dp[k][n];
    }
    
    private int sum(int[] nums, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
