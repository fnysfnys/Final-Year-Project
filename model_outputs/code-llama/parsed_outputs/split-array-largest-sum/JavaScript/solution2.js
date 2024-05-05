function splitArray(nums, k) {
   let dp = new Array(nums.length + 1).fill(0);
   for (let i = 1; i <= nums.length; i++) {
       dp[i] = Math.max(dp[i - 1], nums[i - 1] + dp[i - 2]);
   }
   return dp[nums.length];
}
