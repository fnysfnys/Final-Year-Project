class Solution {
    public int combinationSum4(int[] nums, int target) {
      int[] dp = new int[target + 1];
      Arrays.fill(dp, -1);
      return helper(nums, target, dp);
    }
    
    private int helper(int[] nums, int target, int[] dp) {
      if (target == 0) {
        return 1;
      }
      if (dp[target] != -1) {
        return dp[target];
      }
      int count = 0;
      for (int num : nums) {
        if (target - num >= 0) {
          count += helper(nums, target - num, dp);
        }
      }
      dp[target] = count;
      return count;
    }
    
}
