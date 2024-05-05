function combinationSum4(nums, target) {
   nums.sort((a, b) => a - b);
   let count = 0;
   for (let i = 0; i < nums.length; i++) {
       let mid = Math.floor(nums.length / 2);
       if (nums[mid] >= target) {
           count += Math.floor(target / nums[i]);
           target %= nums[i];
       } else {
           count += Math.floor(target / nums[i + mid]);
           target %= nums[i + mid];
       }
   }
   return count;
}
