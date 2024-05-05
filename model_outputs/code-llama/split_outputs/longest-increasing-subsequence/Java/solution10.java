public int lengthOfLIS(int[] nums) {
   return lengthOfLIS(nums, 0);
}

private int lengthOfLIS(int[] nums, int start) {
   if (start >= nums.length) {
       return 0;
   }
   int maxLength = 0;
   for (int i = start; i < nums.length; i++) {
       maxLength = Math.max(maxLength, lengthOfLIS(nums, i + 1) + 1);
   }
   return maxLength;
}
