function combinationSum4(nums, target) {
   nums.sort((a, b) => a - b);
   let count = 0;
   for (let i = 0; i < nums.length; i++) {
       count += Math.floor(target / nums[i]);
       target %= nums[i];
   }
   return count;
}
