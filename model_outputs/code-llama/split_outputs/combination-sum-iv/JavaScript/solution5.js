function combinationSum4(nums, target) {
   const hash = {};
   for (let i = 0; i < nums.length; i++) {
       hash[nums[i]] = hash[nums[i]] || 0;
       hash[nums[i]]++;
   }
   let count = 0;
   for (let i = 0; i < nums.length; i++) {
       if (hash[nums[i]] > 0) {
           count += Math.floor(target / nums[i]);
           target %= nums[i];
       }
   }
   return count;
}
