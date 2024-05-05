public boolean canPartition(int[] nums) {
   int sum = 0;
   for (int num : nums) {
       sum += num;
   }
   if (sum % 2 == 1) {
       return false;
   }
   int target = sum / 2;
   return canPartition(nums, 0, target);
}

private boolean canPartition(int[] nums, int start, int target) {
   if (start == nums.length) {
       return true;
   }
   for (int i = start; i < nums.length; i++) {
       if (nums[i] <= target) {
           nums[i] = 0;
           if (canPartition(nums, i + 1, target - nums[i])) {
               return true;
           }
           nums[i] = nums[i] + nums[i];
       }
   }
   return false;
}
