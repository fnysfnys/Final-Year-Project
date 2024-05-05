function numberOfArithmeticSlices(nums) {
   nums.sort((a, b) => a - b);
   let count = 0;
   for (let i = 0; i < nums.length - 2; i++) {
       if (nums[i + 1] - nums[i] === nums[i + 2] - nums[i + 1]) {
           count++;
       }
   }
   return count;
}
