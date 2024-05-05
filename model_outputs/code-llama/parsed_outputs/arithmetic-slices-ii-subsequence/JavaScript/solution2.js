function numberOfArithmeticSlices(nums) {
   let dp = new Array(nums.length).fill(0);
   for (let i = 2; i < nums.length; i++) {
       if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
           dp[i] = dp[i - 1] + 1;
       }
   }
   return dp.reduce((a, b) => a + b, 0);
}
