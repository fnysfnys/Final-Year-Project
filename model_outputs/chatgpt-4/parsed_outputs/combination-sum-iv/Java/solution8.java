class Solution {
    public int combinationSum4(int[] nums, int target) {
        // Handling negative numbers
        Arrays.sort(nums);
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++) {
            for (int num : nums) {
                if (num > 0 && i + num <= target) {
                    dp[i + num] += dp[i];
                }
            }
        }
        return dp[target];
    }
}
