function largestDivisibleSubset(nums) {
   nums.sort((a, b) => a - b);
   let currentSubset = [];
   for (let i = 0; i < nums.length; i++) {
       if (nums[i] % nums[i - 1] === 0) {
           currentSubset.push(nums[i]);
       }
   }
   return currentSubset;
}
