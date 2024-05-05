public int combinationSum4(int[] nums, int target) {
   Arrays.sort(nums);
   int count = 0;
   for (int i = 0; i < nums.length; i++) {
       int j = Arrays.binarySearch(nums, target - nums[i]);
       if (j >= 0) {
           count++;
       }
   }
   return count;
}
