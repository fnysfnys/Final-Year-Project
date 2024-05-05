class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            dp[0] += i * nums[i];
        }
        int max = dp[0];
        for (int k = 1; k < n; k++) {
            dp[k] = dp[k - 1] + totalSum - n * nums[n - k];
            max = Math.max(max, dp[k]);
        }
        return max;
    }
    
}
