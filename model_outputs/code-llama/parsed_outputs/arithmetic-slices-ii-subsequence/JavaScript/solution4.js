function numberOfArithmeticSlices(nums) {
   let hash = {};
   for (let i = 0; i < nums.length; i++) {
       if (hash[nums[i]] === undefined) {
           hash[nums[i]] = 0;
       }
       hash[nums[i]]++;
   }
   let slices = 0;
   for (let i = 0; i < nums.length - 2; i++) {
       if (hash[nums[i]] > 0 && hash[nums[i + 1]] > 0 && hash[nums[i + 2]] > 0) {
           slices++;
       }
   }
   return slices;
}
