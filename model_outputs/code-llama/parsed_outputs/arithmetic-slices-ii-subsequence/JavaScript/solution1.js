function numberOfArithmeticSlices(nums) {
   let slices = 0;
   for (let i = 0; i < nums.length - 2; i++) {
       for (let j = i + 1; j < nums.length - 1; j++) {
           for (let k = j + 1; k < nums.length; k++) {
               if (nums[k] - nums[j] === nums[j] - nums[i]) {
                   slices++;
               }
           }
       }
   }
   return slices;
}
