class Solution {
    public boolean canPartition(int[] nums) {
       int sum = 0;
       for (int num : nums) {
           sum += num;
       }
       if (sum % 2 == 1) {
           return false;
       }
       int target = sum / 2;
       int mask = (1 << nums.length) - 1;
       return canPartition(nums, 0, target, mask);
    }
    
    private boolean canPartition(int[] nums, int start, int target, int mask) {
       if (start == nums.length) {
           return true;
       }
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] <= target) {
               mask = mask | (1 << i);
               if (canPartition(nums, i + 1, target - nums[i], mask)) {
                   return true;
               }
               mask = mask & ~(1 << i);
           }
       }
       return false;
    }
    
}
