function combinationSum4(nums, target) {
   if (target === 0) return 1;
   if (target < 0) return 0;
   let count = 0;
   for (let i = 0; i < nums.length; i++) {
       count += combinationSum4(nums.slice(i + 1), target - nums[i]);
   }
   return count;
}
