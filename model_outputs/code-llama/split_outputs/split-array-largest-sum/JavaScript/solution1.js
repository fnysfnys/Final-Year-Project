function splitArray(nums, k) {
   let maxSum = 0;
   for (let i = 0; i < nums.length; i++) {
       for (let j = i + 1; j < nums.length; j++) {
           let sum = 0;
           for (let k = i; k <= j; k++) {
               sum += nums[k];
           }
           maxSum = Math.max(maxSum, sum);
       }
   }
   return maxSum;
}
