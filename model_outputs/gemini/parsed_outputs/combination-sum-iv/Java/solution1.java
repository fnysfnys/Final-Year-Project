class Solution {
    public int combinationSum4(int[] nums, int target) {
      int[] dp = new int[target + 1];
      dp[0] = 1; // Base case: empty combination
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
