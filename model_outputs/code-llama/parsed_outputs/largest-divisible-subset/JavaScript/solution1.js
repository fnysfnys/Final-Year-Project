function largestDivisibleSubset(nums) {
   let maxLength = 0;
   let currentLength = 0;
   let currentSubset = [];
   for (let i = 0; i < nums.length; i++) {
       for (let j = i + 1; j < nums.length; j++) {
           if (nums[i] % nums[j] === 0) {
               currentLength++;
               currentSubset.push(nums[j]);
           }
       }
       if (currentLength > maxLength) {
           maxLength = currentLength;
           currentSubset = [nums[i]];
       }
   }
   return currentSubset;
}
