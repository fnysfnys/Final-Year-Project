function splitArray(nums, k) {
   let bestSplit = [];
   backtrack(nums, k, 0, 0, bestSplit);
   return bestSplit;
}

function backtrack(nums, k, sum, index, bestSplit) {
   if (sum > bestSplit[0]) {
       bestSplit[0] = sum;
   }
   if (index === nums.length) {
       return;
   }
   for (let i = index; i < nums.length; i++) {
       sum += nums[i];
       backtrack(nums, k, sum, i + 1, bestSplit);
       sum -= nums[i];
   }
}
