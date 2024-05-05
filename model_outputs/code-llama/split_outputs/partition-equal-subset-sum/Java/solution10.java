public boolean canPartition(int[] nums) {
   int sum = 0;
   for (int num : nums) {
       sum += num;
   }
   if (sum % 2 == 1) {
       return false;
   }
   int target = sum / 2;
   int left = 0;
   int right = nums.length - 1;
   while (left < right) {
       if (nums[left] + nums[right] > target) {
           right--;
       } else if (nums[left] + nums[right] < target) {
           left++;
       } else {
           return true;
       }
   }
   return false;
}
