public int lengthOfLIS(int[] nums) {
   int length = 0;
   for (int i = 0; i < nums.length; i++) {
       if (length == 0 || nums[i] > nums[length - 1]) {
           length++;
       } else {
           int index = Arrays.binarySearch(nums, 0, length, nums[i]);
           if (index < 0) {
               index = -index - 1;
           }
           nums[index] = nums[i];
       }
   }
   return length;
}
