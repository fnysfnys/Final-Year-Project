class Solution {
    public int combinationSum4(int[] nums, int target) {
        // Create an array to store the number of ways to reach each value from 0 to target
        int[] dp = new int[target + 1];
        // Initialize dp[0] to 1 (there's one way to reach 0)
        dp[0] = 1;
        
        // Calculate the number of ways for each value from 1 to target
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }
        
        return dp[target];
    }
}
