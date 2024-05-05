   var largestDivisibleSubset = function(nums) {
       nums.sort((a, b) => a - b);
       const n = nums.length;
       const dp = new Array(n).fill(1);
       let maxSize = 1;
       let maxIndex = 0;

       for (let i = 1; i < n; i++) {
           for (let j = 0; j < i; j++) {
               if (nums[i] % nums[j] === 0) {
                   dp[i] = Math.max(dp[i], dp[j] + 1);
                   if (dp[i] > maxSize) {
                       maxSize = dp[i];
                       maxIndex = i;
                   }
               }
           }
       }

       const result = [];
       while (maxSize > 0) {
           result.unshift(nums[maxIndex]);
           maxSize--;
           for (let i = maxIndex - 1; i >= 0; i--) {
               if (dp[i] === maxSize && nums[maxIndex] % nums[i] === 0) {
                   maxIndex = i;
                   break;
               }
           }
       }

       return result;
   };
   