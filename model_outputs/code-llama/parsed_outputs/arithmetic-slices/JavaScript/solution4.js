function numberOfArithmeticSlices(nums) {
   const memo = {};
   for (let i = 0; i < nums.length - 2; i++) {
       if (nums[i + 1] - nums[i] === nums[i + 2] - nums[i + 1]) {
           memo[i] = (memo[i] || 0) + 1;
       }
   }
   return Object.values(memo).reduce((a, b) => a + b, 0);
}
