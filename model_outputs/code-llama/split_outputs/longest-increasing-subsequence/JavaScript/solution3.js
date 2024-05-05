function lengthOfLIS(nums) {
   let sortedNums = nums.slice().sort((a, b) => a - b);
   let maxLength = 0;
   for (let i = 0; i < sortedNums.length; i++) {
       let currentLength = 1;
       for (let j = i + 1; j < sortedNums.length; j++) {
           if (sortedNums[j] > sortedNums[i]) {
               currentLength++;
           }
       }
       maxLength = Math.max(maxLength, currentLength);
   }
   return maxLength;
}
