function combinationSum4(nums, target) {
   const memo = new Map();
   return combinationSum4Helper(nums, target, 0, memo);
   
   function combinationSum4Helper(nums, target, index, memo) {
       if (target === 0) return 1;
       if (target < 0) return 0;
       if (memo.has(target)) return memo.get(target);
       let count = 0;
       for (let i = index; i < nums.length; i++) {
           count += combinationSum4Helper(nums, target - nums[i], i + 1, memo);
       }
       memo.set(target, count);
       return count;
   }
}
