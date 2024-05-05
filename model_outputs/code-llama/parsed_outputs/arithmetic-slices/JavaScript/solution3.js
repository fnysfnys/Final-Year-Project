function numberOfArithmeticSlices(nums) {
   let count = 0;
   for (let i = 0; i < nums.length - 2; i++) {
       if (nums[i + 1] - nums[i] === nums[i + 2] - nums[i + 1]) {
           count += numberOfArithmeticSlices(nums.slice(i + 1));
       }
   }
   return count;
}
