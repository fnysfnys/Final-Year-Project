class Solution {
    public int lengthOfLIS(int[] nums) {
      int n = nums.length;
      Integer[] dp = new Integer[n];
    
      return helper(nums, 0, dp);
    }
    
    private int helper(int[] nums, int i, Integer[] dp) {
      if (i >= nums.length) return 0;
      if (dp[i] != null) return dp[i];
    
      int max = 1; // Minimum LIS starting at i is 1 (itself)
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] < nums[j]) {
          max = Math.max(max, helper(nums, j, dp) + 1);
        }
      }
    
      dp[i] = max;
      return max;
    }
    
}
