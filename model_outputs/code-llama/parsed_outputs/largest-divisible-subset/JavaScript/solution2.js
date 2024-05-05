function largestDivisibleSubset(nums) {
   let dp = new Array(nums.length).fill(0);
   let maxLength = 0;
   let currentSubset = [];
   for (let i = 0; i < nums.length; i++) {
       for (let j = 0; j < i; j++) {
           if (nums[i] % nums[j] === 0) {
               dp[i] = Math.max(dp[i], dp[j] + 1);
           }
       }
       if (dp[i] > maxLength) {
           maxLength = dp[i];
           currentSubset = [nums[i]];
       }
   }
   return currentSubset;
}
