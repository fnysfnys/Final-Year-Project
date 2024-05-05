function numberOfArithmeticSlices(nums) {
   const hash = {};
   for (let i = 0; i < nums.length - 2; i++) {
       if (nums[i + 1] - nums[i] === nums[i + 2] - nums[i + 1]) {
           hash[i] = (hash[i] || 0) + 1;
       }
   }
   return Object.values(hash).reduce((a, b) => a + b, 0);
}
