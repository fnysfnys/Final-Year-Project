class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        
        int[] prefixSum = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }
        
        for (int i = 1; i <= n; i++) {
            dp[i] = prefixSum[i];
        }
        
        for (int i = 2; i <= k; i++) {
            for (int j = n; j >= i; j--) {
                dp[j] = Integer.MAX_VALUE;
                for (int x = i - 1; x <= j - 1; x++) {
                    dp[j] = Math.min(dp[j], Math.max(dp[x], prefixSum[j] - prefixSum[x]));
                }
            }
        }
        
        return dp[n];
    }
}
