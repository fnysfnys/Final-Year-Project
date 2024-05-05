class Solution {
    public boolean canPartition(int[] nums) {
       int sum = 0;
       for (int num : nums) {
           sum += num;
       }
       if (sum % 2 == 1) {
           return false;
       }
       int target = sum / 2;
       int[] dp = new int[target + 1];
       dp[0] = 1;
       for (int i = 1; i <= target; i++) {
           for (int j = 0; j < nums.length; j++) {
               if (nums[j] <= i) {
                   dp[i] = dp[i] || dp[i - nums[j]];
               }
           }
       }
       return dp[target];
    }
    
}
