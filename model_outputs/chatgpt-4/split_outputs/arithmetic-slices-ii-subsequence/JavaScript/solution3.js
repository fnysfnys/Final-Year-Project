   /**
    * @param {number[]} nums
    * @return {number}
    */
   var numberOfArithmeticSlices = function(nums) {
       let count = 0;
       const dp = new Array(nums.length).fill(0).map(() => new Map());

       for (let i = 1; i < nums.length; i++) {
           for (let j = 0; j < i; j++) {
               const diff = nums[i] - nums[j];
               const prevCount = dp[j].get(diff) || 0;
               dp[i].set(diff, (dp[i].get(diff) || 0) + prevCount + 1);
               count += prevCount;
           }
       }

       return count;
   };
   