function combinationSum4(nums, target) {
   const combinations = [];
   backtrack(nums, target, 0, []);
   return combinations.length;
   
   function backtrack(nums, target, index, combination) {
       if (target === 0) {
           combinations.push(combination);
           return;
       }
       for (let i = index; i < nums.length; i++) {
           if (target >= nums[i]) {
               combination.push(nums[i]);
               backtrack(nums, target - nums[i], i + 1, combination);
               combination.pop();
           }
       }
   }
}
