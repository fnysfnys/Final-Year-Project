function numberOfArithmeticSlices(nums) {
   const dp = new Array(nums.length).fill(0);
   return numberOfArithmeticSlicesRecursive(nums, 0, dp);
}

function numberOfArithmeticSlicesRecursive(nums, i, dp) {
   if (i >= nums.length - 2) {
       return 0;
   }
   if (nums[i + 1] - nums[i] === nums[i + 2] - nums[i + 1]) {
       dp[i] = dp[i - 1] + 1;
   }
   return numberOfArithmeticSlicesRecursive(nums, i + 1, dp);
}
