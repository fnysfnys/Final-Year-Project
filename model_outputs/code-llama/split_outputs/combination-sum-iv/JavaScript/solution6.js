function combinationSum4(nums, target) {
   nums.sort((a, b) => a - b);
   let count = 0;
   for (let i = 0; i < nums.length; i++) {
       let low = 0;
       let high = nums.length - 1;
       while (low <= high) {
           let mid = Math.floor((low + high) / 2);
           if (nums[mid] >= target) {
               high = mid - 1;
           } else {
               low = mid + 1;
           }
       }
       count += Math.floor(target / nums[i]);
       target %= nums[i];
   }
   return count;
}
