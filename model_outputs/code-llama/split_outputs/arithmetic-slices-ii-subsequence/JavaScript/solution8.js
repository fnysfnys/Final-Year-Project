function numberOfArithmeticSlices(nums) {
   let memo = new Array(nums.length).fill(0);
   for (let i = 0; i < nums.length - 2; i++) {
       if (nums[i] - nums[i + 1] === nums[i + 1] - nums[i + 2]) {
           memo[i] = 1;
       }
   }
   return memo.reduce((a, b) => a + b, 0);
}
