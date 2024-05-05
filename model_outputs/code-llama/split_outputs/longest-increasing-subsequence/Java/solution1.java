public int lengthOfLIS(int[] nums) {
   int maxLength = 0;
   for (int i = 0; i < nums.length; i++) {
       int currentLength = 1;
       for (int j = i + 1; j < nums.length; j++) {
           if (nums[j] > nums[i]) {
               currentLength++;
           }
       }
       maxLength = Math.max(maxLength, currentLength);
   }
   return maxLength;
}
