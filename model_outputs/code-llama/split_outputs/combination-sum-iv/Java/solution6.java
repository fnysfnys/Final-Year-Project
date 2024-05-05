public int combinationSum4(int[] nums, int target) {
   int count = 0;
   for (int i = 0; i < nums.length; i++) {
       if (target - nums[i] >= 0) {
           count += combinationSum4(nums, target - nums[i]);
       }
   }
   return count;
}
