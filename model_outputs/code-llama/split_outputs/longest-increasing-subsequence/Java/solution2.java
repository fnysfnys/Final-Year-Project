public int lengthOfLIS(int[] nums) {
   int[] dp = new int[nums.length];
   for (int i = 0; i < nums.length; i++) {
       dp[i] = 1;
       for (int j = 0; j < i; j++) {
           if (nums[j] < nums[i]) {
               dp[i] = Math.max(dp[i], dp[j] + 1);
           }
       }
   }
   return dp[nums.length - 1];
}
