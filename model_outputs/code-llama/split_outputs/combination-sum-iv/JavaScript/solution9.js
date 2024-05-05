function combinationSum4(nums, target) {
   const memo = new Map();
   const dp = new Array(target + 1).fill(0);
   dp[0] = 1;
   for (let i = 1; i <= target; i++) {
       for (let j = 0; j < nums.length; j++) {
           if (i >= nums[j]) {
               dp[i] += dp[i - nums[j]];
           }
       }
   }
   return dp[target];
}
