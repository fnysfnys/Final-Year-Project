function splitArray(nums, k) {
   let sum = 0;
   for (let i = 0; i < nums.length; i++) {
       sum += nums[i];
   }
   let maxSum = sum / k;
   let minSum = sum / (k + 1);
   let bestSplit = [];
   for (let i = 0; i < nums.length; i++) {
       if (nums[i] > maxSum) {
           bestSplit.push(nums[i]);
       } else if (nums[i] < minSum) {
           bestSplit.push(nums[i]);
       }
   }
   return bestSplit;
}
