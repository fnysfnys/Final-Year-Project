class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        int n = nums.length;
        int[] dp = new int[n];
        for (int i = 2; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (2 * nums[j] == nums[i] + nums[i - 2]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            count += dp[i] - 1;
        }
        return count;
    }
}
