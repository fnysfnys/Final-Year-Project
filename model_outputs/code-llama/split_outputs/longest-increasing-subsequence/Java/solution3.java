public int lengthOfLIS(int[] nums) {
   int[] dp = new int[nums.length];
   for (int i = 0; i < nums.length; i++) {
       int index = Arrays.binarySearch(dp, 0, i, nums[i]);
       if (index < 0) {
           index = -index - 1;
       }
       dp[index] = nums[i];
   }
   return dp.length;
}
