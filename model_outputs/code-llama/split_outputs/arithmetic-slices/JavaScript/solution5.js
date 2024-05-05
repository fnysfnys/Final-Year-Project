function numberOfArithmeticSlices(nums) {
   const dp = new Array(nums.length).fill(0);
   for (let i = 2; i < nums.length; i++) {
       if (nums[i - 1] - nums[i - 2] === nums[i] - nums[i - 1]) {
           dp[i] = dp[i - 1] + 1;
       }
   }
   return dp[nums.length - 1];
}
