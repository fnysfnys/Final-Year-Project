function numberOfArithmeticSlices(nums) {
   let slices = 0;
   for (let i = 0; i < nums.length - 2; i++) {
       let left = i + 1;
       let right = nums.length - 1;
       while (left < right) {
           let mid = Math.floor((left + right) / 2);
           if (nums[mid] - nums[i] === nums[mid] - nums[i + 1]) {
               left = mid + 1;
           } else {
               right = mid - 1;
           }
       }
       slices += left - i;
   }
   return slices;
}
