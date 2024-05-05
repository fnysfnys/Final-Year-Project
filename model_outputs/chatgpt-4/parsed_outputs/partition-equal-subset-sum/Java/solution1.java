public class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum % 2 != 0) return false;
        int subsetSum = totalSum / 2;
        boolean[] dp = new boolean[subsetSum + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = subsetSum; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[subsetSum];
    }
}