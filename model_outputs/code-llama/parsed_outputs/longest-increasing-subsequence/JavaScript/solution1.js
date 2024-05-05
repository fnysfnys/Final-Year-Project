function lengthOfLIS(nums) {
   let maxLength = 0;
   for (let i = 0; i < nums.length; i++) {
       let currentLength = 1;
       for (let j = i + 1; j < nums.length; j++) {
           if (nums[j] > nums[i]) {
               currentLength++;
           }
       }
       maxLength = Math.max(maxLength, currentLength);
   }
   return maxLength;
}
