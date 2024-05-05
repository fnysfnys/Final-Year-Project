class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) {
            return false; // Total sum must be even for equal partition
        }
        int targetSum = totalSum / 2;
        boolean[] dp = new boolean[targetSum + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int j = targetSum; j >= num; j--) {
                dp[j] |= dp[j - num];
            }
        }
        return dp[targetSum];
    }
    
}
