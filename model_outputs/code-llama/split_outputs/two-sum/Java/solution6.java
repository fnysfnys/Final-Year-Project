public int[] twoSum(int[] nums, int target) {
   int[] dp = new int[nums.length];
   for (int i = 0; i < nums.length; i++) {
       dp[i] = nums[i];
   }
   for (int i = 1; i < nums.length; i++) {
       for (int j = 0; j < i; j++) {
           if (dp[i] + dp[j] == target) {
               return new int[] {j, i};
           }
       }
   }
   return null;
}
