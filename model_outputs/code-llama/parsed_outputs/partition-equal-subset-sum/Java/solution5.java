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
       return canPartition(nums, 0, target);
    }
    
    private boolean canPartition(int[] nums, int start, int target) {
       if (start == nums.length) {
           return true;
       }
       int mid = start + (nums.length - start) / 2;
       if (nums[mid] > target) {
           return false;
       }
       int left = canPartition(nums, start, target - nums[mid]);
       int right = canPartition(nums, mid + 1, target - nums[mid]);
       return left && right;
    }
    
}
