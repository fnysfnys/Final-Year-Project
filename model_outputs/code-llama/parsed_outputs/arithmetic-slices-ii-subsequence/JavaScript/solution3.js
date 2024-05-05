function numberOfArithmeticSlices(nums) {
   let slices = 0;
   for (let i = 2; i < nums.length; i++) {
       if (nums[i] - nums[i - 1] === nums[i - 1] - nums[i - 2]) {
           slices++;
       }
   }
   return slices;
}
