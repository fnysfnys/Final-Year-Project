function numberOfArithmeticSlices(nums) {
   const memo = {};
   return numberOfArithmeticSlicesRecursive(nums, 0, memo);
}

function numberOfArithmeticSlicesRecursive(nums, i, memo) {
   if (i >= nums.length - 2) {
       return 0;
   }
   if (nums[i + 1] - nums[i] === nums[i + 2] - nums[i + 1]) {
       memo[i] = (memo[i] || 0) + 1;
   }
   return numberOfArithmeticSlicesRecursive(nums, i + 1, memo);
}
